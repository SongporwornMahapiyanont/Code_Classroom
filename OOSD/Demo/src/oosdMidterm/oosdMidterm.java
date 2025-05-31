package oosdMidterm;
import java.util.ArrayList;

public class oosdMidterm{
    public static void main(String[] args){
        new Demo1().test();
        System.out.println();
        new Demo2().test();
    }
}
class Demo1 {
    public void test (){
        Country c1 = new Country("001","Thailand",3);
        Country c2 = new Country("002","Philippines",6.2);
        Country c3 = new Country("003","Cambodia",6.8);
        Country c4 = new Country("004","Bangladesh",7.4);
        Country c5 = new Country("005","Greece",2.2);
        DB db = new DB();
        db.add(c1);
        db.add(c2);
        db.add(c3);
        db.add(c4);
        db.add(c5);
        db.print();
        System.out.println("-----");
        db.print(2);
    }
}
class Demo2{
    public void test(){
        DevelopingCountry A = new DevelopingCountry("001","Thailand",3,6,9);
        DevelopingCountry B = new DevelopingCountry("002","Philippines",6.2,5,8);
        DevelopingCountry C = new DevelopingCountry("003","Cambodia",6.8,8,8);
        A.factoryBase(5);
        A.importTechnology(6);
        A.governmentProject(8);
        B.factoryBase(4);
        B.importTechnology(5);
        B.governmentProject(5);
        C.factoryBase(4);
        C.importTechnology(3);
        C.governmentProject(4);
        
        
        DevelopedCountry D = new DevelopedCountry("008","Korea",2.2,5,4);
        DevelopedCountry E = new DevelopedCountry("009","USA",2.1,10,5);
        DevelopedCountry F = new DevelopedCountry("010","USA",1.4,6,7);
        
        D.education(8);
        D.publicSevices(7);
        D.exportTechnology(6);
        E.education(6);
        E.publicSevices(6);
        E.exportTechnology(10);
        F.education(7);
        F.publicSevices(8);
        F.exportTechnology(5);
        
        DB db = new DB();
        db.add(A);
        db.add(B);
        db.add(C);
        db.add(D);
        db.add(E);
        db.add(F);
        db.print();
        System.out.println(db.topPollution());
        System.out.println(db.topInnovation());
        System.out.println(db.topHappyness());
    }
}
class Country{
    private String code,name;
    private double gdp;
    Country(String code,String name ,double gdp){
        this.code = code;
        this.name = name;
        this.gdp = gdp;
    }
    public String getCode(){
        return this.code;
    }
    public String getName(){
        return this.name;
    }
    public double getGdp(){
        return this.gdp;
    }
    public void setCode(String info){
        this.code = info;
    }
    public void setName(String info){
        this.name = info;
    }
    public void setGdp(double info){
        this.gdp = info;
    }
    public String toString(){
        return "Code: " + this.code + ", Country: "+ this.name + ", GDP: " + this.gdp;
    }
}
class DevelopingCountry extends Country{
    private double pollution,corruption;
    DevelopingCountry(String code,String name ,double gdp,double pollution,double corruption){
        super(code,name,gdp);
        this.pollution = pollution;
        this.corruption = corruption;
    }
    public double getPollution(){
        return this.pollution;
    }
    public double getCorruption(){
        return this.corruption;
    }
    public void factoryBase(double n){
        this.pollution += n*0.5;
        setGdp(getGdp() + n*0.5);
    }
    public void importTechnology(double n){
        setGdp(getGdp() + n*0.1);
    }
    public void governmentProject(double n){
        this.corruption += n*0.15;
    }
    public String toString(){
        return "Code: " + getCode() + ", Country: "+ getName() + ", GDP: " + getGdp() + ", pollution: " + this.pollution+ ", corruption: " + this.corruption;
    }
}
class DevelopedCountry extends Country{
    private double innovation, happynessScore;
    DevelopedCountry(String code,String name ,double gdp,double innovation,double happynessScore){
        super(code,name,gdp);
        this.innovation = innovation;
        this.happynessScore = happynessScore;
    }
    public double getInnovation(){
        return this.innovation;
    }
    public double getHappynessScore(){
        return this.happynessScore;
    }
    public void education(double n){
        this.innovation += n*0.1;
    }
    public void publicSevices(double n){
        this.happynessScore += n*0.25;
        setGdp(getGdp() - n*0.1);
    }
    public void exportTechnology(double n){
        setGdp(getGdp() + n*0.1);
    }
    public String toString(){
        return "Code: " + getCode() + ", Country: "+ getName() + ", GDP: " + getGdp() + ", innovation: " + this.innovation + ", happynessScore:" + this.happynessScore;
    }
}

class DB{
    private ArrayList<Country> storage = new ArrayList<Country>();
    public void add(Country info){
        storage.add(info);
    }
    public String topPollution(){
        double maxValue = 0;
        int indexMax = -1;
        for(int i=0;i<this.storage.size();i++)
        {
            if(this.storage.get(i) instanceof DevelopingCountry)
            {
                DevelopingCountry d = (DevelopingCountry)storage.get(i);
                if(d.getPollution() > maxValue )
                {
                    maxValue = d.getPollution();
                    indexMax = i;
                }
            }
        }
        if(indexMax != -1)
        {
            return storage.get(indexMax).getName();
        }
        else{
            return "Not found";
        }
    }
    public String topCurruption(){
        double maxValue = 0;
        int indexMax = -1;
        for(int i=0;i<storage.size();i++)
        {
            if(storage.get(i) instanceof DevelopingCountry)
            {
                DevelopingCountry d = (DevelopingCountry) storage.get(i);
                if(d.getCorruption() >= maxValue)
                {
                    maxValue = d.getCorruption();
                    indexMax = i;
                }
            }
        }
        if(indexMax != -1){
            return storage.get(indexMax).getName();
        }
        else{
            return "Not found";
        }
    }
    public String topInnovation(){
        double maxValue = 0;
        int indexMax = -1;
        for(int i=0;i<storage.size();i++)
        {
            if(storage.get(i) instanceof DevelopedCountry)
            {
                DevelopedCountry d = (DevelopedCountry) storage.get(i);
                if(d.getInnovation() >= maxValue)
                {
                    maxValue = d.getInnovation();
                    indexMax = i;
                }
            }
        }
        if(indexMax != -1){
            return storage.get(indexMax).getName();
        }
        else{
            return "Not found";
        }
    }
    
    
    public String topHappyness(){
        double maxValue = 0;
        int indexMax = -1;
        for(int i=0;i<storage.size();i++)
        {
            if(storage.get(i) instanceof DevelopedCountry)
            {
                DevelopedCountry d = (DevelopedCountry) storage.get(i);
                if(d.getHappynessScore() >= maxValue)
                {
                    maxValue = d.getHappynessScore();
                    indexMax = i;
                }
            }
        }
        if(indexMax != -1){
            return storage.get(indexMax).getName();
        }
        else{
            return "Not found";
        }
    }
    public void print(int n){
        for(int i = 0 ;i<n;i++)
        {
            System.out.println(storage.get(i).toString());
        }
        
    }
    public void print(){
        for(int i = 0 ;i<storage.size();i++)
        {
            System.out.println(storage.get(i).toString());
        }
        
    }
}
    
