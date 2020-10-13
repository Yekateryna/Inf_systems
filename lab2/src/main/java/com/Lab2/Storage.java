package com.Lab2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Storage {
	private String filePath;
	private ArrayList<Student> db;
	
	Storage(){};
	
	public ArrayList<Student> getDb() {
		return db;
	}

	public void setDb(ArrayList<Student> db) {
		this.db = db;
	}
	
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public void create() 
	{
		db = new ArrayList<Student>();
	}
	
	public void read()
	{
		try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(filePath));
            db =(ArrayList<Student>)is.readObject();
            is.close();
        } catch (IOException | ClassNotFoundException ex) {System.out.println("File Error");}
	}
	
	public void add(Student st)
	{
		db.add(st);
	}
	
	public void del(int pos)
	{
		db.remove(pos);
	}
	
	public void save()
	{
		try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filePath));
            os.writeObject(db);
            os.close();
        }catch (IOException ex){/*pass*/}
	}
	
	
	
}