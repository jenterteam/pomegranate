package com.pom.core.log;

import com.pom.core.persistence.ICoreLog;
import com.pom.core.persistence.enums.CrudType;
import com.pom.core.persistence.filter.IFilterAndPage;
import com.pom.core.persistence.web.response.IResponse;
/**
 *  Created by mustafagungor on 21.03.2019
 */
public interface ILogService {
    /**
     *
     * @param userId
     * @param crudType
     * @param message
     * @param requestData
     * @param requestIp
     * @return
     * @throws Exception
     */
    ICoreLog saveLog(String userId, CrudType crudType, String message, byte[] requestData, String requestIp)
            throws Exception;

    /**
     *
     * @param userId
     * @param crudType
     * @param taskId
     * @param message
     * @param requestData
     * @param requestIp
     * @return
     * @throws Exception
     */
    ICoreLog saveTaskLog(String userId, CrudType crudType, Long taskId, String message, byte[] requestData,
                              String requestIp) throws Exception;

    /**
     *
     * @param userId
     * @param crudType
     * @param policyId
     * @param message
     * @param requestData
     * @param requestIp
     * @return
     * @throws Exception
     */
    ICoreLog savePolicyLog(String userId, CrudType crudType, Long policyId, String message, byte[] requestData,
                                String requestIp) throws Exception;

    /**
     *
     * @param userId
     * @param crudType
     * @param profileId
     * @param message
     * @param requestData
     * @param requestIp
     * @return
     * @throws Exception
     */
    ICoreLog saveProfileLog(String userId, CrudType crudType, Long profileId, String message, byte[] requestData,
                                 String requestIp) throws Exception;


    /**
     *
     * @return
     */
    IResponse list(IFilterAndPage filterAndPage);
}
