package com.componentwise.eval;

import java.io.Serializable;

/**
 * This code was modified from
 * https://www.chegg.com/homework-help/questions-and-answers/question-1-instances-following-class-must-placed-session-servlet-used-key-hashtable-object-q30389746
 * @author kaigh.taylor
 * @version 1.0
 * @since 24/07/2019
 */

public class UserKey implements Serializable {
    private static final long serialVersionUID = -2480652954299816555L;
    private String name;
    private String userid;

    /**
     * @param name
     * @param userid
     */
    public UserKey(String name, String userid) {
        this.name = name;
        this.userid = userid;
    }

    /**
     * @return - name
     */
    public String getName() {
        return name;
    }

    /**
     * @return - userid
     */
    public String getUserID() {
        return userid;
    }
}