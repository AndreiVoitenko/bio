package bio.demo.Controllers;


import bio.demo.dao.FilesRepository;
import bio.demo.dao.InputsRepository;
import bio.demo.model.Files;
import bio.demo.model.Inputs;
import bio.demo.service.HibernateSearchService;
import bio.demo.service.InpImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.EntityManagerFactory;
import org.springframework.transaction.annotation.Transactional;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;


@Controller
public class AppController {

    @Autowired
    InputsRepository repo;

    @Autowired
    FilesRepository fr;

    @Autowired
    private HibernateSearchService searcher;

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Autowired
    InpImpl inp;

    @GetMapping
    public String start(Model list){
        //inp.addCards();
        list.addAttribute("attributes", repo.findAll());
        return "FirstPage";
    }

    @GetMapping(value = "/login")
    public String login(Model list){
        return "login";
    }


    @GetMapping(value="/form")
    public String form(Model list){
        list.addAttribute("form", new Inputs());
        return "AddToDb";
    }

    @GetMapping(value="/picture/{id:.}")
    public String showPic(Model list, @PathVariable Long id){
        String encoded = Base64.getEncoder().encodeToString(fr.getFile(id).getData());
        list.addAttribute("picture", encoded);
        return "Picture";
    }

    @GetMapping(value="/acronym/{id:.}")
    public String showAcr(Model list, @PathVariable Long id){
        list.addAttribute("attributes", repo.findAcr(id));
        return "AboutAcronym";
    }

    @Transactional
    @DeleteMapping(value = "/delete/{id:.}")
    public String delete(Model list, @PathVariable Long id){
        fr.deleteFile(id);
        repo.deleteById(id);
        list.addAttribute("attributes", repo.findAll());
        return "redirect:/FirstPage";
    }

    @Transactional
    @GetMapping(value = "/change/{id:.}")
    public String change(Model list, @PathVariable Long id){
        System.out.println(id);
        fr.deleteFile(id);
        repo.deleteById(id);
        list.addAttribute("attributes", repo.findAll());
        return "redirect:/FirstPage";
    }

    @PostMapping(value="/form")
    public String create(Inputs abc, @RequestParam("array") MultipartFile[] files, BindingResult bindingResult) throws IOException {
        for (MultipartFile one : files){
            String fileName = StringUtils.cleanPath(one.getOriginalFilename());

            Files dbFile = new Files();
            dbFile.setFileName(fileName);
            dbFile.setFileType(one.getContentType());
            dbFile.setData(one.getBytes());
            dbFile.setInputs(abc);

            List<Files> fina = new ArrayList();
            fina.add(dbFile);

            try{
                abc.setFiles(fina);
                repo.save(abc);
            }
            catch (Exception ex){
                System.out.println(ex);
            }
        }

        return "redirect:FirstPage";
    }


    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(@RequestParam(value = "text", required = false) String q, Model model) {
        List<Inputs> searchResults = null;
        try {
            searchResults = searcher.fuzzySearch(q);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        model.addAttribute("search", searchResults);
        return "Search";
    }

    @RequestMapping(value = "/filter", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String filter(@RequestBody String ab, Model list) {
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, Boolean> filterParams = new HashMap<>();
        //filterParams.put("Id", false);
        filterParams.put("OldNumerationFrom", false);
        filterParams.put("OldNumerationTo", false);
        //filterParams.put("IsolationSource", false);
        filterParams.put("IsolationDateStart", false);
        filterParams.put("IsolationDateEnd", false);

        String[] splited = ab.split("&");
        for (String one : splited) {
            String[] splitedNew = one.split("=");
            if(splitedNew.length>1) {
                hashMap.put(splitedNew[0], splitedNew[1]);
            }
        }

        ArrayList<Inputs> results = new ArrayList<>();

        if(hashMap.containsKey("IsolationDateStart")){
            LocalDate startDate = LocalDate.parse(hashMap.get("IsolationDateStart"));
            List<Inputs> result = repo.FromData(startDate);
            results.addAll(result);
        }
        if(hashMap.containsKey("IsolationDateEnd")){
            LocalDate endDate = LocalDate.parse(hashMap.get("IsolationDateEnd"));
            List<Inputs> result = repo.ToData(endDate);
            results.addAll(result);
        }
        /*if(hashMap.containsKey("OldNumerationFrom")){
            List<Inputs> result = repo.OldNumerationFrom(Integer.parseInt(hashMap.get("OldNumerationFrom")));
            results.addAll(result);
        }
        if(hashMap.containsKey("OldNumerationTo")){
            List<Inputs> result = repo.OldNumerationTo(Integer.parseInt(hashMap.get("OldNumerationTo")));
            results.addAll(result);
        }
        if(hashMap.containsKey("IsolationSource")){
            if (!hashMap.get("IsolationSource").equals("All")){
                List<Inputs> result = repo.IsolationSource(hashMap.get("IsolationSource"));
                results.addAll(result);
            }
            else{
                List<Inputs> result = repo.findAll();
                results.addAll(result);
            }
        }*/
        if(hashMap.containsKey("MaldiScoreFrom")){
            List<Inputs> result = repo.MaldiScoreFrom(Integer.parseInt(hashMap.get("MaldiScoreFrom")));
            results.addAll(result);
        }
        if(hashMap.containsKey("MaldiScoreTo")){
            List<Inputs> result = repo.MaldiScoreTo(Integer.parseInt(hashMap.get("MaldiScoreTo")));
            results.addAll(result);
        }
        /*if(hashMap.containsKey("PositionInFridgeFrom")){
            List<Inputs> result = repo.PositionInFridgeFrom(Integer.parseInt(hashMap.get("PositionInFridgeFrom")));
            results.addAll(result);
        }
        if(hashMap.containsKey("PositionInFridgeTo")){
            List<Inputs> result = repo.PositionInFridgeTo(Integer.parseInt(hashMap.get("PositionInFridgeTo")));
            results.addAll(result);
        }*/
        if(hashMap.containsKey("StorageDateStart")){
            LocalDate startDate = LocalDate.parse(hashMap.get("StorageDateStart"));
            List<Inputs> result = repo.StorageDateStart(startDate);
            results.addAll(result);
        }
        if(hashMap.containsKey("StorageDateEnd")){
            LocalDate endDate = LocalDate.parse(hashMap.get("StorageDateEnd"));
            List<Inputs> result = repo.StorageDateEnd(endDate);
            results.addAll(result);
        }

        Map<Inputs, Integer> map= new HashMap<>();
        for(Inputs s: results){
            map.put(s,Collections.frequency(results,s));
        }


        if(map.containsValue(hashMap.size())){
            list.addAttribute("attributes", getKeys(map, hashMap.size()));
        }

        if (hashMap.size() == 0){
            List<Inputs> result = repo.findAll();
            list.addAttribute("attributes", result);
        }

        return "FirstPage";
    }

    public <K, V> Set<K> getKeys(Map<K, V> map, V value) {
        Set<K> keys = new HashSet<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }
}

