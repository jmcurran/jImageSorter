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
public class HotkeyDirectoryPair {
    private String strHotkey;
    private String strDirectory;

    public HotkeyDirectoryPair(String strHotkey, String strDirectory) throws InvalidHotkeyException {
        if(strHotkey == null)
            throw new InvalidHotkeyException("Invalid Hotkey--key cannot be null");
        this.strHotkey = strHotkey;
        this.strDirectory = strDirectory;
    }
    
    public String getHotkey(){
        return strHotkey;
    }
    
    public String getDirectory(){
        return strDirectory;
    }
    
    
}
