package homeworks.homework13;

import homeworks.homework13.dao.controller.FamilyController;

import java.io.*;

public class SaveLoader {
    String path = "base.bin";

    public SaveLoader(FamilyController familyController){
        File base = new File(path);
        try{
            FileOutputStream fos = new FileOutputStream(base);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(familyController.getAllFamilies());
            oos.close();
            fos.close();
            System.out.println("Save done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
