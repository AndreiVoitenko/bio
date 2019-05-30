package bio.demo.service;


import bio.demo.model.Inputs;
import org.apache.lucene.search.Query;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.Search;
import org.hibernate.search.query.dsl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.util.List;

@Service
public class HibernateSearchService {


    @Autowired
    private final EntityManager centiManager;


    @Autowired
    public HibernateSearchService(EntityManager entityManager) {
        super();
        this.centiManager = entityManager;
    }


    public void initializeHibernateSearch() {

        try {
            FullTextEntityManager fullTextEntityManager = Search.getFullTextEntityManager(centiManager);
            fullTextEntityManager.createIndexer().startAndWait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Transactional
    public List<Inputs> fuzzySearch(String searchTerm) {
        FullTextEntityManager fullTextEntityManager = Search.getFullTextEntityManager(centiManager);
        QueryBuilder qb = fullTextEntityManager.getSearchFactory().buildQueryBuilder().forEntity(Inputs.class).get();
        Query luceneQuery = qb.keyword()
                .fuzzy()
                .withEditDistanceUpTo(1)
                .withPrefixLength(1)

                .onFields("Acronym", "Old_nummeration", "Isolation_source", "Isolation_date",
                        "Genus", "Species", "Subspecies", "MALDI_score", "Position_in_fridge",
                        "Storage_date", "Cultivation_conditions")
                .ignoreFieldBridge()
                .matching(searchTerm)

                .createQuery();

        javax.persistence.Query jpaQuery = fullTextEntityManager.createFullTextQuery(luceneQuery, Inputs.class);

        // execute search

        List<Inputs> BaseballCardList = null;
        try {

            BaseballCardList = jpaQuery.getResultList();
        } catch (NoResultException nre) {
            ;// do nothing
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println(nre);

        }

        return BaseballCardList;


    }
}
