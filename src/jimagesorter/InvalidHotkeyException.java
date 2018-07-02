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
public class InvalidHotkeyException extends Exception {

    /**
     * Creates a new instance of <code>InvalidHotkeyException</code> without
     * detail message.
     */
    public InvalidHotkeyException() {
    }

    /**
     * Constructs an instance of <code>InvalidHotkeyException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidHotkeyException(String msg) {
        super(msg);
    }
}
