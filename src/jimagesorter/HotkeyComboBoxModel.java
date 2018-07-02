/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jimagesorter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author James
 */
public class HotkeyComboBoxModel extends AbstractListModel implements ComboBoxModel{
    List<String> Hotkeys;
    String selection = null;

    public HotkeyComboBoxModel(List<String> CurrentHotkeys) {
        
       this.Hotkeys = new ArrayList<>(Arrays.asList("0","1","2","3","4","5","6","7","8","9",
                               "a","b","c","d","e","f","g","h","i","j",
                               "k","l","m","n","o","p","q","r","s","t",
                               "u","v","w","x","y","z"));
       
       Hotkeys.removeAll(CurrentHotkeys);
    }
    
    @Override
    public int getSize() {
        return Hotkeys.size();
    }

    @Override
    public Object getElementAt(int i) {
        return Hotkeys.get(i);
    }

    @Override
    public void setSelectedItem(Object o) {
        selection = (String)o;
    }

    @Override
    public Object getSelectedItem() {
        return selection;
    }
    
}
