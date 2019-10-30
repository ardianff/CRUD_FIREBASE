package ardian.belajar.crudfirebase.Model;

import com.google.firebase.database.Exclude;

public class Teacher {
    private String name;
    private String imageURL;
    private String key;
    private String nim;
    private String studi;
    private int position;

    public Teacher() {
        //empty constructor needed
    }
    public Teacher (int position){
        this.position = position;
    }
    public Teacher(String name, String imageUrl ,String Nim, String Studi) {
        if (name.trim().equals("")) {
            name = "No Name";
        }
        this.name = name;
        this.imageURL = imageUrl;
        this.nim = Nim;
        this.studi =Studi;

    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getStudi() {
        return studi;
    }
    public void setStudi(String studi) {
        this.nim = studi;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getImageUrl() {
        return imageURL;
    }
    public void setImageUrl(String imageUrl) {
        this.imageURL = imageUrl;
    }
    @Exclude
    public String getKey() {
        return key;
    }
    @Exclude
    public void setKey(String key) {
        this.key = key;
    }
}