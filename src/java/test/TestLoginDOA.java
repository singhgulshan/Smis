/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;
import com.ctc.smis.dao.LoginDAO;
import com.ctc.smis.vo.User;

/**
 *
 * @author Gulshan
 */
class TestLoginDOA {
    public static void main(String[] s){
        
        LoginDAO ob = new LoginDAO();
        User obj = new User();
        obj.setUserid("scott");
        obj.setUserpassword("tiger");
        obj.setUsertype("user");
        ob.saveUser(obj);
    }
    
}
