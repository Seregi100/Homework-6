/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Seregi
 */
public class SaverRunnable implements Runnable{
    private Car car;
    private String path;

    public SaverRunnable(Car car, String path) {
        this.car = car;
        this.path = path;
    }
    
    @Override
    public void run(){
        if (this.path!=null && this.car!=null){
            FileOutputStream fos;
            try{
                fos = new FileOutputStream(this.path);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(this.car);
                oos.close();
            }catch(IOException ex){
                System.out.println("Вам не хватает прав сохранить файл в корневой каталог. Запустите приложение от имени администратора и повторите попытку");
            }
        }
    }
    
}
