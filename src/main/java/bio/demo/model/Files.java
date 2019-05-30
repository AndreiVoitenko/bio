package bio.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "files", schema = "", catalog = "relationship")
public class Files {

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "inputsTable_id", referencedColumnName = "id")
    Inputs inputs;

    @Id
    @GeneratedValue
    Long id;

    String fileName;

    String fileType;

    @Lob
    byte[] data;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public Inputs getInputs() {
        return inputs;
    }

    public void setInputs(Inputs inputs) {
        this.inputs = inputs;
    }
}
