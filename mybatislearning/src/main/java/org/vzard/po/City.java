package org.vzard.po;

/**
 * Created by V-zar on 2017/8/27.
 */
public class City {

    private int id;
    private String Name;
    private String District;
    private long Population;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public long getPopulation() {
        return Population;
    }

    public void setPopulation(long population) {
        Population = population;
    }

    @Override
    public String toString(){
        return "City[ id="+id+",name="+getName()+",district="+getDistrict()+",population="+getPopulation()+"]\n";
    }

}
