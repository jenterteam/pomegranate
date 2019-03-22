package com.pom.core.persistence.web.response;

import com.pom.core.persistence.enums.RestResponseStatus;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *  Created by mustafagungor on 21.03.2019
 */
public interface IResponse extends Serializable {
    /**
     * 1
     * @return status of response
     */
    RestResponseStatus getStatus();

    /**
     * 2
     * @return message strings in response
     */
    List<String> getMessages();

    /**
     * 3
     * @return custom map defined by the executed ICommand class.
     */
    Map<String, Object> getResultMap();

    int getTotal();

    /**
     * 4
     * @return JSON representation of the IRestResponse object.
     */
    String toJson();

    /**
     * 5
     * @return
     */
    Object getData();
}
