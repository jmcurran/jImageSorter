/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jimagesorter;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author James
 */
public class FileMoveRecord {
    final private Path from;
    final private List<Path> to;
    
    public FileMoveRecord(Path src, Path classifiedDest) {
        this.from = src;
        this.to = new ArrayList<>();
        this.to.add(classifiedDest);
    }
    
    public void add(Path dest){
        to.add(dest);
    }
        
    public Path getFrom(){
        return from;
    }
    
    public List<Path> getTo(){
        return to;
    }
    
}
