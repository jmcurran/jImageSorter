/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jimagesorter;

/**
 *
 * @author James
 */
public class ImageResult {
    final private String name;
    final private String bestClass;
    final private double maxProb;
    final private double trueClassProb;

    public ImageResult(String name, String bestClass, double maxProb, double trueClassProb) {
        this.name = name;
        this.bestClass = bestClass;
        this.maxProb = maxProb;
        this.trueClassProb = trueClassProb;
    }

    public ImageResult(String strResultLine) {
        String[] tokens = strResultLine.split(",");
        name = tokens[0];
        bestClass = tokens[1];
        maxProb = Double.parseDouble(tokens[2]);
        trueClassProb = Double.parseDouble(tokens[3]);
    }
    
    /**
     *
     * @return
     */
    public String format(){
        if(trueClassProb == maxProb){ //means flagged for low probability
            return String.format("<html>%s: %.5f</html>", name, maxProb);
        }else{
            return String.format("<html>%s: <b style=\"color:red\">%s</b> %.5f vs %.5f</html>", name, bestClass, maxProb, trueClassProb);
        }
    }
    
    public String getName(){
        return name;
    }
    
}
