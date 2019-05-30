package bio.demo.model;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.FieldBridge;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.bridge.builtin.IntegerBridge;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Indexed
@Entity
@Table(name = "inputsTable", schema = "", catalog = "relationship")
public class Inputs {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    public Long id;

    @Field
    String Acronym;

    @Field
    String Old_nummeration;

    @Field
    String Isolation_source;

    @Field
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate Isolation_date;

    @Field
    String Genus;

    @Field
    String Species;

    @Field
    String Subspecies;

    @Field
    @FieldBridge(impl = IntegerBridge.class)
    Integer MALDI_score;

    @Field
    String Position_in_fridge;

    @Field
    @FieldBridge(impl = IntegerBridge.class)
    Integer Storage_date;

    @Field
    String Cultivation_conditions;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "inputs")
    List<Files> files;


    String GentamycinMIC;
    String KanamycinMIC;
    String StreptomycinMIC;
    String NeomycinMIC;
    String TetracyclinMIC;
    String ErytomycinMIC;
    String ClindamycinMIC;
    String ChloramphenicolMIC;
    String AmpicillinMIC;
    String PenicillinMIC;
    String VancomycinMIC;
    String QuinipristindalfopristinMIC;
    String LinezolidMIC;
    String TrimethoprimMIC;
    String CiprofloxacinMIC;
    String RifampicinMIC;
    String LylosineMIC;
    String Imipenem;
    String Metronidazole;
    String FortyFour;
    String ThirtySeven;
    String Twenty;
    String Fiveteen;
    String Four;
    String Autoaggregation;
    String Gasformation;
    Integer AOCwholecells;
    Integer AOCCelllysates;
    Integer pHresistance;
    Integer wvbilesaltsresistance;
    Integer wvpancreatinresistance;
    Integer LAM;
    Integer LAmgl;
    Integer KM;
    Integer Kmgl;
    Integer LAKM;
    Integer LAKmgl;
    Integer proteolSMA;
    Integer CaCN;
    Integer Piimakalgend;
    Integer CLAMRSmgl;
    Integer CLASKIMM;
    Integer CLAmgl;
    Integer TAA;
    Integer TAS;
    Integer TARmmolTroloxequivalentL;
    Integer ResisttoAggregation;
    Integer APFcopies;
    Integer CaCNTWO;
    Integer NOconcm;
    Integer HOconcm;
    Integer Ratioofsignals;
    Integer HOwholecellsgml;
    Integer HOcelllysategml;
    Integer Lacticacidhmicrommoll;
    Integer Aceticacid;
    Integer Succinicacid;
    Integer HOmM;
    Integer Varasemadtulemusedgml;

    String Glycerol;
    String Erythritol;
    String Arabinose;
    String Larabinose;
    String Ribose;
    String Dxylose;
    String Lxylose;
    String Dadonitol;
    String MethylDxylopyranoside;
    String Dgalactose;
    String Dglucose;
    String Dfructose;
    String Dmannose;
    String Lsorbose;
    String Lrhamnose;
    String Dulcitol;
    String Inositol;
    String Dmannitol;
    String Dsorbitol;
    String mannopyranoside;
    String glycopyranoside;
    String Nacetylglucosamine;
    String Amygdalin;
    String Arbutine;
    String Esculine;
    String Salitsin;
    String Dcellobiose;
    String Dmaltose;
    String Dlactosebovine;
    String Dmelibiose;
    String Dsaccharose;
    String Dtrehalose;
    String Inulin;
    String Dmelezitose;
    String Draffinose;
    String AmidonstarchGlycogen;
    String Xylitol;
    String Bgentiobiose;
    String Dturanose;
    String Dlyxose;
    String Dtagatose;
    String Dfucose;
    String Lfucose;
    String Darabitol;
    String Larabitol;
    String Potassiumgluconate;
    String PotassiumTketogluconate;
    String PotassiumFketogluconate;
    String Arginine;
    String RaftiloseL;
    String RaftiloseSynergy;
    String RaftiloseP;

    String hvanahvana;
    String Alkalinephosphatase;
    String EsteraseCF;
    String EsteraseCE;
    String LipaseC;
    String Leucinearylamidase;
    String Valinearylamidase;
    String Cystinearylamidase;
    String Trypsin;
    String chymotrypsin;
    String Acidphosphatase;
    String NaphtholASBIphosphohydrolase;
    String Agalactosidase;
    String Bgalactosidase;
    String Bglucuronidase;
    String Aglucosidase;
    String Bglucosidase;
    String Nacetyl;
    String Bglucosaminidase;
    String Amannosidase;
    String Afucosidase;

    String BgalactosidaseONPG;
    String argininedihydrolaseADH;
    String lysinedecarboxylaseLDC;
    String ornithinedecarboxylaseODC;
    String citrateutilisationCIT;
    String HSproductionHS;
    String ureaseURE;
    String tryptophanediaminaseTDA;
    String indoleproductionIND;
    String acetoinproductionVogesProskauerVP;
    String gelatinaseGEL;
    String DglucosefermentationGLU;
    String DmannitolfermentationMAN;
    String inositolfermentationINO;
    String DsorbitolfermentationSOR;
    String LrhamnosefermentationRHA;
    String DsucrosefermentationSAC;
    String DmelibiosefermentationMEL;
    String amygdalinfermentationAMY;
    String LarabinosefermentationARA;

    String ArginiinPut;
    String ArginiinCad;
    String GlutamiinPut;
    String GlutamiinCad;
    String LusiinPut;
    String LusiinCad;
    String OrnitiinPut;
    String OrnitiinCad;
    String HistidiinHis;

    String AceticacidTFh;
    String AceticacidFEh;
    String LacticacidTFh;
    String LacticacidFEh;
    String SuccinicacidTFh;
    String SuccinicacidFEh;
    String Ethanol;

    public String getGentamycinMIC() {
        return GentamycinMIC;
    }

    public void setGentamycinMIC(String gentamycinMIC) {
        GentamycinMIC = gentamycinMIC;
    }

    public String getKanamycinMIC() {
        return KanamycinMIC;
    }
    public void setKanamycinMIC(String kanamycinMIC) {
        KanamycinMIC = kanamycinMIC;
    }

    public String getStreptomycinMIC() {
        return StreptomycinMIC;
    }

    public void setStreptomycinMIC(String streptomycinMIC) {
        StreptomycinMIC = streptomycinMIC;
    }

    public String getNeomycinMIC() {
        return NeomycinMIC;
    }

    public void setNeomycinMIC(String neomycinMIC) {
        NeomycinMIC = neomycinMIC;
    }

    public String getTetracyclinMIC() {
        return TetracyclinMIC;
    }

    public void setTetracyclinMIC(String tetracyclinMIC) {
        TetracyclinMIC = tetracyclinMIC;
    }

    public String getErytomycinMIC() {
        return ErytomycinMIC;
    }

    public void setErytomycinMIC(String erytomycinMIC) {
        ErytomycinMIC = erytomycinMIC;
    }

    public String getClindamycinMIC() {
        return ClindamycinMIC;
    }

    public void setClindamycinMIC(String clindamycinMIC) {
        ClindamycinMIC = clindamycinMIC;
    }

    public String getChloramphenicolMIC() {
        return ChloramphenicolMIC;
    }

    public void setChloramphenicolMIC(String chloramphenicolMIC) {
        ChloramphenicolMIC = chloramphenicolMIC;
    }

    public String getAmpicillinMIC() {
        return AmpicillinMIC;
    }

    public void setAmpicillinMIC(String ampicillinMIC) {
        AmpicillinMIC = ampicillinMIC;
    }

    public String getPenicillinMIC() {
        return PenicillinMIC;
    }

    public void setPenicillinMIC(String penicillinMIC) {
        PenicillinMIC = penicillinMIC;
    }

    public String getVancomycinMIC() {
        return VancomycinMIC;
    }

    public void setVancomycinMIC(String vancomycinMIC) {
        VancomycinMIC = vancomycinMIC;
    }

    public String getQuinipristindalfopristinMIC() {
        return QuinipristindalfopristinMIC;
    }

    public void setQuinipristindalfopristinMIC(String quinipristindalfopristinMIC) {
        QuinipristindalfopristinMIC = quinipristindalfopristinMIC;
    }

    public String getLinezolidMIC() {
        return LinezolidMIC;
    }

    public void setLinezolidMIC(String linezolidMIC) {
        LinezolidMIC = linezolidMIC;
    }

    public String getTrimethoprimMIC() {
        return TrimethoprimMIC;
    }

    public void setTrimethoprimMIC(String trimethoprimMIC) {
        TrimethoprimMIC = trimethoprimMIC;
    }

    public String getCiprofloxacinMIC() {
        return CiprofloxacinMIC;
    }

    public void setCiprofloxacinMIC(String ciprofloxacinMIC) {
        CiprofloxacinMIC = ciprofloxacinMIC;
    }

    public String getRifampicinMIC() {
        return RifampicinMIC;
    }

    public void setRifampicinMIC(String rifampicinMIC) {
        RifampicinMIC = rifampicinMIC;
    }

    public String getLylosineMIC() {
        return LylosineMIC;
    }

    public void setLylosineMIC(String lylosineMIC) {
        LylosineMIC = lylosineMIC;
    }

    public String getImipenem() {
        return Imipenem;
    }

    public void setImipenem(String imipenem) {
        Imipenem = imipenem;
    }

    public String getMetronidazole() {
        return Metronidazole;
    }

    public void setMetronidazole(String metronidazole) {
        Metronidazole = metronidazole;
    }

    public String getFortyFour() {
        return FortyFour;
    }

    public void setFortyFour(String fortyFour) {
        FortyFour = fortyFour;
    }

    public String getThirtySeven() {
        return ThirtySeven;
    }

    public void setThirtySeven(String thirtySeven) {
        ThirtySeven = thirtySeven;
    }

    public String getTwenty() {
        return Twenty;
    }

    public void setTwenty(String twenty) {
        Twenty = twenty;
    }

    public String getFiveteen() {
        return Fiveteen;
    }

    public void setFiveteen(String fiveteen) {
        Fiveteen = fiveteen;
    }

    public String getFour() {
        return Four;
    }

    public void setFour(String four) {
        Four = four;
    }

    public String getAutoaggregation() {
        return Autoaggregation;
    }

    public void setAutoaggregation(String autoaggregation) {
        Autoaggregation = autoaggregation;
    }

    public String getGasformation() {
        return Gasformation;
    }

    public void setGasformation(String gasformation) {
        Gasformation = gasformation;
    }

    public Integer getAOCwholecells() {
        return AOCwholecells;
    }

    public void setAOCwholecells(Integer AOCwholecells) {
        this.AOCwholecells = AOCwholecells;
    }

    public Integer getAOCCelllysates() {
        return AOCCelllysates;
    }

    public void setAOCCelllysates(Integer AOCCelllysates) {
        this.AOCCelllysates = AOCCelllysates;
    }

    public Integer getpHresistance() {
        return pHresistance;
    }

    public void setpHresistance(Integer pHresistance) {
        this.pHresistance = pHresistance;
    }

    public Integer getWvbilesaltsresistance() {
        return wvbilesaltsresistance;
    }

    public void setWvbilesaltsresistance(Integer wvbilesaltsresistance) {
        this.wvbilesaltsresistance = wvbilesaltsresistance;
    }

    public Integer getWvpancreatinresistance() {
        return wvpancreatinresistance;
    }

    public void setWvpancreatinresistance(Integer wvpancreatinresistance) {
        this.wvpancreatinresistance = wvpancreatinresistance;
    }

    public Integer getLAM() {
        return LAM;
    }

    public void setLAM(Integer LAM) {
        this.LAM = LAM;
    }

    public Integer getLAmgl() {
        return LAmgl;
    }

    public void setLAmgl(Integer LAmgl) {
        this.LAmgl = LAmgl;
    }

    public Integer getKM() {
        return KM;
    }

    public void setKM(Integer KM) {
        this.KM = KM;
    }

    public Integer getKmgl() {
        return Kmgl;
    }

    public void setKmgl(Integer kmgl) {
        Kmgl = kmgl;
    }

    public Integer getLAKM() {
        return LAKM;
    }

    public void setLAKM(Integer LAKM) {
        this.LAKM = LAKM;
    }

    public Integer getLAKmgl() {
        return LAKmgl;
    }

    public void setLAKmgl(Integer LAKmgl) {
        this.LAKmgl = LAKmgl;
    }

    public Integer getProteolSMA() {
        return proteolSMA;
    }

    public void setProteolSMA(Integer proteolSMA) {
        this.proteolSMA = proteolSMA;
    }

    public Integer getCaCN() {
        return CaCN;
    }

    public void setCaCN(Integer caCN) {
        CaCN = caCN;
    }

    public Integer getPiimakalgend() {
        return Piimakalgend;
    }

    public void setPiimakalgend(Integer piimakalgend) {
        Piimakalgend = piimakalgend;
    }

    public Integer getCLAMRSmgl() {
        return CLAMRSmgl;
    }

    public void setCLAMRSmgl(Integer CLAMRSmgl) {
        this.CLAMRSmgl = CLAMRSmgl;
    }

    public Integer getCLASKIMM() {
        return CLASKIMM;
    }

    public void setCLASKIMM(Integer CLASKIMM) {
        this.CLASKIMM = CLASKIMM;
    }

    public Integer getCLAmgl() {
        return CLAmgl;
    }

    public void setCLAmgl(Integer CLAmgl) {
        this.CLAmgl = CLAmgl;
    }

    public Integer getTAA() {
        return TAA;
    }

    public void setTAA(Integer TAA) {
        this.TAA = TAA;
    }

    public Integer getTAS() {
        return TAS;
    }

    public void setTAS(Integer TAS) {
        this.TAS = TAS;
    }

    public Integer getTARmmolTroloxequivalentL() {
        return TARmmolTroloxequivalentL;
    }

    public void setTARmmolTroloxequivalentL(Integer TARmmolTroloxequivalentL) {
        this.TARmmolTroloxequivalentL = TARmmolTroloxequivalentL;
    }

    public Integer getResisttoAggregation() {
        return ResisttoAggregation;
    }

    public void setResisttoAggregation(Integer resisttoAggregation) {
        ResisttoAggregation = resisttoAggregation;
    }

    public Integer getAPFcopies() {
        return APFcopies;
    }

    public void setAPFcopies(Integer APFcopies) {
        this.APFcopies = APFcopies;
    }

    public Integer getCaCNTWO() {
        return CaCNTWO;
    }

    public void setCaCNTWO(Integer caCNTWO) {
        CaCNTWO = caCNTWO;
    }

    public Integer getNOconcm() {
        return NOconcm;
    }

    public void setNOconcm(Integer NOconcm) {
        this.NOconcm = NOconcm;
    }

    public Integer getHOconcm() {
        return HOconcm;
    }

    public void setHOconcm(Integer HOconcm) {
        this.HOconcm = HOconcm;
    }

    public Integer getRatioofsignals() {
        return Ratioofsignals;
    }

    public void setRatioofsignals(Integer ratioofsignals) {
        Ratioofsignals = ratioofsignals;
    }

    public Integer getHOwholecellsgml() {
        return HOwholecellsgml;
    }

    public void setHOwholecellsgml(Integer HOwholecellsgml) {
        this.HOwholecellsgml = HOwholecellsgml;
    }

    public Integer getHOcelllysategml() {
        return HOcelllysategml;
    }

    public void setHOcelllysategml(Integer HOcelllysategml) {
        this.HOcelllysategml = HOcelllysategml;
    }

    public Integer getLacticacidhmicrommoll() {
        return Lacticacidhmicrommoll;
    }

    public void setLacticacidhmicrommoll(Integer lacticacidhmicrommoll) {
        Lacticacidhmicrommoll = lacticacidhmicrommoll;
    }

    public Integer getAceticacid() {
        return Aceticacid;
    }

    public void setAceticacid(Integer aceticacid) {
        Aceticacid = aceticacid;
    }

    public Integer getSuccinicacid() {
        return Succinicacid;
    }

    public void setSuccinicacid(Integer succinicacid) {
        Succinicacid = succinicacid;
    }

    public Integer getHOmM() {
        return HOmM;
    }

    public void setHOmM(Integer HOmM) {
        this.HOmM = HOmM;
    }

    public Integer getVarasemadtulemusedgml() {
        return Varasemadtulemusedgml;
    }

    public void setVarasemadtulemusedgml(Integer varasemadtulemusedgml) {
        Varasemadtulemusedgml = varasemadtulemusedgml;
    }

    public String getGlycerol() {
        return Glycerol;
    }

    public void setGlycerol(String glycerol) {
        Glycerol = glycerol;
    }

    public String getErythritol() {
        return Erythritol;
    }

    public void setErythritol(String erythritol) {
        Erythritol = erythritol;
    }

    public String getArabinose() {
        return Arabinose;
    }

    public void setArabinose(String Arabinose) {
        Arabinose = Arabinose;
    }

    public String getLarabinose() {
        return Larabinose;
    }

    public void setLarabinose(String larabinose) {
        Larabinose = larabinose;
    }

    public String getRibose() {
        return Ribose;
    }

    public void setRibose(String ribose) {
        Ribose = ribose;
    }

    public String getDxylose() {
        return Dxylose;
    }

    public void setDxylose(String dxylose) {
        Dxylose = dxylose;
    }

    public String getLxylose() {
        return Lxylose;
    }

    public void setLxylose(String lxylose) {
        Lxylose = lxylose;
    }

    public String getDadonitol() {
        return Dadonitol;
    }

    public void setDadonitol(String dadonitol) {
        Dadonitol = dadonitol;
    }

    public String getMethylDxylopyranoside() {
        return MethylDxylopyranoside;
    }

    public void setMethylDxylopyranoside(String methylDxylopyranoside) {
        MethylDxylopyranoside = methylDxylopyranoside;
    }

    public String getDgalactose() {
        return Dgalactose;
    }

    public void setDgalactose(String dgalactose) {
        Dgalactose = dgalactose;
    }

    public String getDglucose() {
        return Dglucose;
    }

    public void setDglucose(String dglucose) {
        Dglucose = dglucose;
    }

    public String getDfructose() {
        return Dfructose;
    }

    public void setDfructose(String dfructose) {
        Dfructose = dfructose;
    }

    public String getDmannose() {
        return Dmannose;
    }

    public void setDmannose(String dmannose) {
        Dmannose = dmannose;
    }

    public String getLsorbose() {
        return Lsorbose;
    }

    public void setLsorbose(String lsorbose) {
        Lsorbose = lsorbose;
    }

    public String getLrhamnose() {
        return Lrhamnose;
    }

    public void setLrhamnose(String lrhamnose) {
        Lrhamnose = lrhamnose;
    }

    public String getDulcitol() {
        return Dulcitol;
    }

    public void setDulcitol(String dulcitol) {
        Dulcitol = dulcitol;
    }

    public String getInositol() {
        return Inositol;
    }

    public void setInositol(String inositol) {
        Inositol = inositol;
    }

    public String getDmannitol() {
        return Dmannitol;
    }

    public void setDmannitol(String dmannitol) {
        Dmannitol = dmannitol;
    }

    public String getDsorbitol() {
        return Dsorbitol;
    }

    public void setDsorbitol(String dsorbitol) {
        Dsorbitol = dsorbitol;
    }

    public String getMannopyranoside() {
        return mannopyranoside;
    }

    public void setMannopyranoside(String mannopyranoside) {
        this.mannopyranoside = mannopyranoside;
    }

    public String getGlycopyranoside() {
        return glycopyranoside;
    }

    public void setGlycopyranoside(String glycopyranoside) {
        this.glycopyranoside = glycopyranoside;
    }

    public String getNacetylglucosamine() {
        return Nacetylglucosamine;
    }

    public void setNacetylglucosamine(String nacetylglucosamine) {
        Nacetylglucosamine = nacetylglucosamine;
    }

    public String getAmygdalin() {
        return Amygdalin;
    }

    public void setAmygdalin(String amygdalin) {
        Amygdalin = amygdalin;
    }

    public String getArbutine() {
        return Arbutine;
    }

    public void setArbutine(String arbutine) {
        Arbutine = arbutine;
    }

    public String getEsculine() {
        return Esculine;
    }

    public void setEsculine(String esculine) {
        Esculine = esculine;
    }

    public String getSalitsin() {
        return Salitsin;
    }

    public void setSalitsin(String salitsin) {
        Salitsin = salitsin;
    }

    public String getDcellobiose() {
        return Dcellobiose;
    }

    public void setDcellobiose(String dcellobiose) {
        Dcellobiose = dcellobiose;
    }

    public String getDmaltose() {
        return Dmaltose;
    }

    public void setDmaltose(String dmaltose) {
        Dmaltose = dmaltose;
    }

    public String getDlactosebovine() {
        return Dlactosebovine;
    }

    public void setDlactosebovine(String dlactosebovine) {
        Dlactosebovine = dlactosebovine;
    }

    public String getDmelibiose() {
        return Dmelibiose;
    }

    public void setDmelibiose(String dmelibiose) {
        Dmelibiose = dmelibiose;
    }

    public String getDsaccharose() {
        return Dsaccharose;
    }

    public void setDsaccharose(String dsaccharose) {
        Dsaccharose = dsaccharose;
    }

    public String getDtrehalose() {
        return Dtrehalose;
    }

    public void setDtrehalose(String dtrehalose) {
        Dtrehalose = dtrehalose;
    }

    public String getInulin() {
        return Inulin;
    }

    public void setInulin(String inulin) {
        Inulin = inulin;
    }

    public String getDmelezitose() {
        return Dmelezitose;
    }

    public void setDmelezitose(String dmelezitose) {
        Dmelezitose = dmelezitose;
    }

    public String getDraffinose() {
        return Draffinose;
    }

    public void setDraffinose(String draffinose) {
        Draffinose = draffinose;
    }

    public String getAmidonstarchGlycogen() {
        return AmidonstarchGlycogen;
    }

    public void setAmidonstarchGlycogen(String amidonstarchGlycogen) {
        AmidonstarchGlycogen = amidonstarchGlycogen;
    }

    public String getXylitol() {
        return Xylitol;
    }

    public void setXylitol(String xylitol) {
        Xylitol = xylitol;
    }

    public String getBgentiobiose() {
        return Bgentiobiose;
    }

    public void setBgentiobiose(String bgentiobiose) {
        Bgentiobiose = bgentiobiose;
    }

    public String getDturanose() {
        return Dturanose;
    }

    public void setDturanose(String dturanose) {
        Dturanose = dturanose;
    }

    public String getDlyxose() {
        return Dlyxose;
    }

    public void setDlyxose(String dlyxose) {
        Dlyxose = dlyxose;
    }

    public String getDtagatose() {
        return Dtagatose;
    }

    public void setDtagatose(String dtagatose) {
        Dtagatose = dtagatose;
    }

    public String getDfucose() {
        return Dfucose;
    }

    public void setDfucose(String dfucose) {
        Dfucose = dfucose;
    }

    public String getLfucose() {
        return Lfucose;
    }

    public void setLfucose(String lfucose) {
        Lfucose = lfucose;
    }

    public String getDarabitol() {
        return Darabitol;
    }

    public void setDarabitol(String darabitol) {
        Darabitol = darabitol;
    }

    public String getLarabitol() {
        return Larabitol;
    }

    public void setLarabitol(String larabitol) {
        Larabitol = larabitol;
    }

    public String getPotassiumgluconate() {
        return Potassiumgluconate;
    }

    public void setPotassiumgluconate(String potassiumgluconate) {
        Potassiumgluconate = potassiumgluconate;
    }

    public String getPotassiumTketogluconate() {
        return PotassiumTketogluconate;
    }

    public void setPotassiumTketogluconate(String potassiumTketogluconate) {
        PotassiumTketogluconate = potassiumTketogluconate;
    }

    public String getPotassiumFketogluconate() {
        return PotassiumFketogluconate;
    }

    public void setPotassiumFketogluconate(String potassiumFketogluconate) {
        PotassiumFketogluconate = potassiumFketogluconate;
    }

    public String getArginine() {
        return Arginine;
    }

    public void setArginine(String arginine) {
        Arginine = arginine;
    }

    public String getRaftiloseL() {
        return RaftiloseL;
    }

    public void setRaftiloseL(String raftiloseL) {
        RaftiloseL = raftiloseL;
    }

    public String getRaftiloseSynergy() {
        return RaftiloseSynergy;
    }

    public void setRaftiloseSynergy(String raftiloseSynergy) {
        RaftiloseSynergy = raftiloseSynergy;
    }

    public String getRaftiloseP() {
        return RaftiloseP;
    }

    public void setRaftiloseP(String raftiloseP) {
        RaftiloseP = raftiloseP;
    }

    public String getHvanahvana() {
        return hvanahvana;
    }

    public void setHvanahvana(String hvanahvana) {
        this.hvanahvana = hvanahvana;
    }

    public String getAlkalinephosphatase() {
        return Alkalinephosphatase;
    }

    public void setAlkalinephosphatase(String alkalinephosphatase) {
        Alkalinephosphatase = alkalinephosphatase;
    }

    public String getEsteraseCF() {
        return EsteraseCF;
    }

    public void setEsteraseCF(String esteraseCF) {
        EsteraseCF = esteraseCF;
    }

    public String getEsteraseCE() {
        return EsteraseCE;
    }

    public void setEsteraseCE(String esteraseCE) {
        EsteraseCE = esteraseCE;
    }

    public String getLipaseC() {
        return LipaseC;
    }

    public void setLipaseC(String lipaseC) {
        LipaseC = lipaseC;
    }

    public String getLeucinearylamidase() {
        return Leucinearylamidase;
    }

    public void setLeucinearylamidase(String leucinearylamidase) {
        Leucinearylamidase = leucinearylamidase;
    }

    public String getValinearylamidase() {
        return Valinearylamidase;
    }

    public void setValinearylamidase(String valinearylamidase) {
        Valinearylamidase = valinearylamidase;
    }

    public String getCystinearylamidase() {
        return Cystinearylamidase;
    }

    public void setCystinearylamidase(String cystinearylamidase) {
        Cystinearylamidase = cystinearylamidase;
    }

    public String getTrypsin() {
        return Trypsin;
    }

    public void setTrypsin(String trypsin) {
        Trypsin = trypsin;
    }

    public String getChymotrypsin() {
        return chymotrypsin;
    }

    public void setChymotrypsin(String chymotrypsin) {
        this.chymotrypsin = chymotrypsin;
    }

    public String getAcidphosphatase() {
        return Acidphosphatase;
    }

    public void setAcidphosphatase(String acidphosphatase) {
        Acidphosphatase = acidphosphatase;
    }

    public String getNaphtholASBIphosphohydrolase() {
        return NaphtholASBIphosphohydrolase;
    }

    public void setNaphtholASBIphosphohydrolase(String naphtholASBIphosphohydrolase) {
        NaphtholASBIphosphohydrolase = naphtholASBIphosphohydrolase;
    }

    public String getAgalactosidase() {
        return Agalactosidase;
    }

    public void setAgalactosidase(String agalactosidase) {
        Agalactosidase = agalactosidase;
    }

    public String getBgalactosidase() {
        return Bgalactosidase;
    }

    public void setBgalactosidase(String bgalactosidase) {
        Bgalactosidase = bgalactosidase;
    }

    public String getBglucuronidase() {
        return Bglucuronidase;
    }

    public void setBglucuronidase(String bglucuronidase) {
        Bglucuronidase = bglucuronidase;
    }

    public String getAglucosidase() {
        return Aglucosidase;
    }

    public void setAglucosidase(String aglucosidase) {
        Aglucosidase = aglucosidase;
    }

    public String getBglucosidase() {
        return Bglucosidase;
    }

    public void setBglucosidase(String bglucosidase) {
        Bglucosidase = bglucosidase;
    }

    public String getNacetyl() {
        return Nacetyl;
    }

    public void setNacetyl(String nacetyl) {
        Nacetyl = nacetyl;
    }

    public String getBglucosaminidase() {
        return Bglucosaminidase;
    }

    public void setBglucosaminidase(String bglucosaminidase) {
        Bglucosaminidase = bglucosaminidase;
    }

    public String getAmannosidase() {
        return Amannosidase;
    }

    public void setAmannosidase(String amannosidase) {
        Amannosidase = amannosidase;
    }

    public String getAfucosidase() {
        return Afucosidase;
    }

    public void setAfucosidase(String afucosidase) {
        Afucosidase = afucosidase;
    }

    public String getBgalactosidaseONPG() {
        return BgalactosidaseONPG;
    }

    public void setBgalactosidaseONPG(String bgalactosidaseONPG) {
        BgalactosidaseONPG = bgalactosidaseONPG;
    }

    public String getArgininedihydrolaseADH() {
        return argininedihydrolaseADH;
    }

    public void setArgininedihydrolaseADH(String argininedihydrolaseADH) {
        this.argininedihydrolaseADH = argininedihydrolaseADH;
    }

    public String getLysinedecarboxylaseLDC() {
        return lysinedecarboxylaseLDC;
    }

    public void setLysinedecarboxylaseLDC(String lysinedecarboxylaseLDC) {
        this.lysinedecarboxylaseLDC = lysinedecarboxylaseLDC;
    }

    public String getOrnithinedecarboxylaseODC() {
        return ornithinedecarboxylaseODC;
    }

    public void setOrnithinedecarboxylaseODC(String ornithinedecarboxylaseODC) {
        this.ornithinedecarboxylaseODC = ornithinedecarboxylaseODC;
    }

    public String getCitrateutilisationCIT() {
        return citrateutilisationCIT;
    }

    public void setCitrateutilisationCIT(String citrateutilisationCIT) {
        this.citrateutilisationCIT = citrateutilisationCIT;
    }

    public String getHSproductionHS() {
        return HSproductionHS;
    }

    public void setHSproductionHS(String HSproductionHS) {
        this.HSproductionHS = HSproductionHS;
    }

    public String getUreaseURE() {
        return ureaseURE;
    }

    public void setUreaseURE(String ureaseURE) {
        this.ureaseURE = ureaseURE;
    }

    public String getTryptophanediaminaseTDA() {
        return tryptophanediaminaseTDA;
    }

    public void setTryptophanediaminaseTDA(String tryptophanediaminaseTDA) {
        this.tryptophanediaminaseTDA = tryptophanediaminaseTDA;
    }

    public String getIndoleproductionIND() {
        return indoleproductionIND;
    }

    public void setIndoleproductionIND(String indoleproductionIND) {
        this.indoleproductionIND = indoleproductionIND;
    }

    public String getAcetoinproductionVogesProskauerVP() {
        return acetoinproductionVogesProskauerVP;
    }

    public void setAcetoinproductionVogesProskauerVP(String acetoinproductionVogesProskauerVP) {
        this.acetoinproductionVogesProskauerVP = acetoinproductionVogesProskauerVP;
    }

    public String getGelatinaseGEL() {
        return gelatinaseGEL;
    }

    public void setGelatinaseGEL(String gelatinaseGEL) {
        this.gelatinaseGEL = gelatinaseGEL;
    }

    public String getDglucosefermentationGLU() {
        return DglucosefermentationGLU;
    }

    public void setDglucosefermentationGLU(String dglucosefermentationGLU) {
        DglucosefermentationGLU = dglucosefermentationGLU;
    }

    public String getDmannitolfermentationMAN() {
        return DmannitolfermentationMAN;
    }

    public void setDmannitolfermentationMAN(String dmannitolfermentationMAN) {
        DmannitolfermentationMAN = dmannitolfermentationMAN;
    }

    public String getInositolfermentationINO() {
        return inositolfermentationINO;
    }

    public void setInositolfermentationINO(String inositolfermentationINO) {
        this.inositolfermentationINO = inositolfermentationINO;
    }

    public String getDsorbitolfermentationSOR() {
        return DsorbitolfermentationSOR;
    }

    public void setDsorbitolfermentationSOR(String dsorbitolfermentationSOR) {
        DsorbitolfermentationSOR = dsorbitolfermentationSOR;
    }

    public String getLrhamnosefermentationRHA() {
        return LrhamnosefermentationRHA;
    }

    public void setLrhamnosefermentationRHA(String lrhamnosefermentationRHA) {
        LrhamnosefermentationRHA = lrhamnosefermentationRHA;
    }

    public String getDsucrosefermentationSAC() {
        return DsucrosefermentationSAC;
    }

    public void setDsucrosefermentationSAC(String dsucrosefermentationSAC) {
        DsucrosefermentationSAC = dsucrosefermentationSAC;
    }

    public String getDmelibiosefermentationMEL() {
        return DmelibiosefermentationMEL;
    }

    public void setDmelibiosefermentationMEL(String dmelibiosefermentationMEL) {
        DmelibiosefermentationMEL = dmelibiosefermentationMEL;
    }

    public String getAmygdalinfermentationAMY() {
        return amygdalinfermentationAMY;
    }

    public void setAmygdalinfermentationAMY(String amygdalinfermentationAMY) {
        this.amygdalinfermentationAMY = amygdalinfermentationAMY;
    }

    public String getLarabinosefermentationARA() {
        return LarabinosefermentationARA;
    }

    public void setLarabinosefermentationARA(String larabinosefermentationARA) {
        LarabinosefermentationARA = larabinosefermentationARA;
    }

    public String getArginiinPut() {
        return ArginiinPut;
    }

    public void setArginiinPut(String arginiinPut) {
        ArginiinPut = arginiinPut;
    }

    public String getArginiinCad() {
        return ArginiinCad;
    }

    public void setArginiinCad(String arginiinCad) {
        ArginiinCad = arginiinCad;
    }

    public String getGlutamiinPut() {
        return GlutamiinPut;
    }

    public void setGlutamiinPut(String glutamiinPut) {
        GlutamiinPut = glutamiinPut;
    }

    public String getGlutamiinCad() {
        return GlutamiinCad;
    }

    public void setGlutamiinCad(String glutamiinCad) {
        GlutamiinCad = glutamiinCad;
    }

    public String getLusiinPut() {
        return LusiinPut;
    }

    public void setLusiinPut(String lusiinPut) {
        LusiinPut = lusiinPut;
    }

    public String getLusiinCad() {
        return LusiinCad;
    }

    public void setLusiinCad(String lusiinCad) {
        LusiinCad = lusiinCad;
    }

    public String getOrnitiinPut() {
        return OrnitiinPut;
    }

    public void setOrnitiinPut(String ornitiinPut) {
        OrnitiinPut = ornitiinPut;
    }

    public String getOrnitiinCad() {
        return OrnitiinCad;
    }

    public void setOrnitiinCad(String ornitiinCad) {
        OrnitiinCad = ornitiinCad;
    }

    public String getHistidiinHis() {
        return HistidiinHis;
    }

    public void setHistidiinHis(String histidiinHis) {
        HistidiinHis = histidiinHis;
    }

    public String getAceticacidTFh() {
        return AceticacidTFh;
    }

    public void setAceticacidTFh(String aceticacidTFh) {
        AceticacidTFh = aceticacidTFh;
    }

    public String getAceticacidFEh() {
        return AceticacidFEh;
    }

    public void setAceticacidFEh(String aceticacidFEh) {
        AceticacidFEh = aceticacidFEh;
    }

    public String getLacticacidTFh() {
        return LacticacidTFh;
    }

    public void setLacticacidTFh(String lacticacidTFh) {
        LacticacidTFh = lacticacidTFh;
    }

    public String getLacticacidFEh() {
        return LacticacidFEh;
    }

    public void setLacticacidFEh(String lacticacidFEh) {
        LacticacidFEh = lacticacidFEh;
    }

    public String getSuccinicacidTFh() {
        return SuccinicacidTFh;
    }

    public void setSuccinicacidTFh(String succinicacidTFh) {
        SuccinicacidTFh = succinicacidTFh;
    }

    public String getSuccinicacidFEh() {
        return SuccinicacidFEh;
    }

    public void setSuccinicacidFEh(String succinicacidFEh) {
        SuccinicacidFEh = succinicacidFEh;
    }

    public String getEthanol() {
        return Ethanol;
    }

    public void setEthanol(String ethanol) {
        Ethanol = ethanol;
    }


    public List<Files> getFiles() {
        return files;
    }

    public void setFiles(List<Files> files) {
        this.files = files;
    }

    public String getAcronym() { return Acronym; }

    public void setAcronym(String acronym) {
        this.Acronym = acronym;
    }

    public String getOld_nummeration() {
        return Old_nummeration;
    }

    public void setOld_nummeration(String old_nummeration) {
        this.Old_nummeration = old_nummeration;
    }

    public String getIsolation_source() {
        return Isolation_source;
    }

    public void setIsolation_source(String isolation_source) {
        this.Isolation_source = isolation_source;
    }

    public LocalDate getIsolation_date() {
        return Isolation_date;
    }

    public void setIsolation_date(LocalDate isolation_date) {
        this.Isolation_date = isolation_date;
    }

    public String getGenus() {
        return Genus;
    }

    public void setGenus(String genus) {
        this.Genus = genus;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        this.Species = species;
    }

    public String getSubspecies() {
        return Subspecies;
    }

    public void setSubspecies(String subspecies) {
        this.Subspecies = subspecies;
    }

    public Integer getMALDI_score() {
        return MALDI_score;
    }

    public void setMALDI_score(Integer MALDI_score) {
        this.MALDI_score = MALDI_score;
    }

    public String getPosition_in_fridge() {
        return Position_in_fridge;
    }

    public void setPosition_in_fridge(String position_in_fridge) {
        this.Position_in_fridge = position_in_fridge;
    }

    public Integer getStorage_date() {
        return Storage_date;
    }

    public void setStorage_date(Integer storage_date) {
        this.Storage_date = storage_date;
    }

    public String getCultivation_conditions() {
        return Cultivation_conditions;
    }

    public void setCultivation_conditions(String cultivation_conditions) {
        this.Cultivation_conditions = cultivation_conditions;
    }

}
