package homeworks.homework13.dao.collection;

import homeworks.homework13.dao.interfaces.FamilyDao;
import homeworks.homework13.family.Family;

import java.io.*;
import java.util.List;

public class FamilyDataStorage implements FamilyDao {

    private String path = "homeworks/homework13/files/family_data.txt";
    private File base = new File(path);

    @Override
    public List<Family> getAllFamilies() {
        return null;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        return null;
    }

    @Override
    public boolean deleteFamily(int index) {
        return false;
    }

    @Override
    public boolean deleteFamily(Family family) {
        return false;
    }

    @Override
    public void saveFamily(Family family) {
        try {
            FileWriter out = new FileWriter(base.getAbsoluteFile());
            out.write(String.valueOf(family));
            out.write("\n");
            out.flush();
            out.close();
        } catch (IOException ex) {
            System.out.println("File not found");
        }
    }

    @Override
    public void loadData(List<Family> families) {

    }
}
