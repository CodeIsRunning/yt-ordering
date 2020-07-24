package com.yt.ordering.auth.model;

import java.io.Serializable;
import lombok.Data;

/**
 * @author  liuxf
 * @date  2020/6/2 15:48
 * @version 1.0
 */
@Data
public class User implements Serializable {
    private Integer id;

    private String userName;

    private String password;

    private static final long serialVersionUID = 1L;
}