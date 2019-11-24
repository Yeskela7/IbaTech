package homeworks.homework13;

import homeworks.homework13.dao.controller.FamilyController;
import homeworks.homework13.family.Family;

import java.io.*;
import java.util.ArrayList;

public class SaveLoader {
    private String path = "";

    public SaveLoader(String path) {
        this.path = path;
    }

    private String getPath() {
        return path;
    }

    public void saveToFile(FamilyController fc) {
        File base = new File(getPath());
        try {
            FileOutputStream fos = new FileOutputStream(base);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(fc.getAllFamilies());
            oos.close();
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Family> loadFromFile() {
        File base = new File(getPath());
        ArrayList<Family> families = new ArrayList<>();
        try {
            if (base.length() == 0) {
                return null;
            }
            FileInputStream fis = new FileInputStream(base);
            ObjectInputStream ois = new ObjectInputStream(fis);
            families = (ArrayList<Family>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return families;
    }
}
