/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulanikmantik;

import java.io.File;
import java.net.URISyntaxException;
import net.sourceforge.jFuzzyLogic.FIS;

/**
 *
 * @author Yusuf
 */
public class Restorant {
    private double area;
    private double perimeter;
    private FIS fis;
    
    public Restorant(double area,double perimeter) throws URISyntaxException{
        this.area=area;
        this.perimeter=perimeter;
        
        File dosya=new File(getClass().getResource("bos.fcl").toURI());
        fis=FIS.load(dosya.getPath(),true);
        fis.setVariable("area", area);
        fis.setVariable("perimeter", perimeter);
        fis.evaluate();
        
    }
    public FIS getModel(){
        return fis;
    }
    
    @Override
    public String toString(){
        String cikti="Area:"+area+"\tPerimeter:\t"+perimeter;
        cikti+="\tTür:\t"+fis.getVariable("tur").getValue();
        return cikti;
    }
    
    
    
    
}
