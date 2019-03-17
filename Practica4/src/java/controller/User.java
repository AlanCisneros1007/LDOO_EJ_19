
package controller;

/**
 *
 * @author Alan Cisneros
 */
class User {
    private String value;
    private String pass;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public String getValue() {
        return value;
    }

    /**
     * @param name the name to set
     */
    public void setValue(String name) {
        this.value = name;
    }
}
