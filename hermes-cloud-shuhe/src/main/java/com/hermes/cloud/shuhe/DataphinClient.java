package com.hermes.cloud.shuhe;

import com.aliyuncs.dataphin.DataphinAcsClient;
import com.aliyuncs.dataphin.model.v20200830.dataprocess.CreateJdbcConnectionRequest;
import com.aliyuncs.dataphin.model.v20200830.dataprocess.CreateJdbcConnectionResponse;
import com.aliyuncs.dataphin.model.v20200830.dataprocess.ExecSqlByJdbcRequest;
import com.aliyuncs.dataphin.model.v20200830.dataprocess.ExecSqlByJdbcResponse;
import com.aliyuncs.exceptions.ClientException;

public class DataphinClient {
    public DataphinAcsClient getDataphinClient() {
        return DataphinAcsClient.create("local", "dp-api.sit.caijj.net", "18CRiC0n3OTYh66r1u1oTjti", "E8kIWMf2XfNdEyxhOJis1Ne61NNKEO");
    }

    public static void main(String[] args) throws ClientException {
        DataphinAcsClient dataphinAcsClient = new DataphinClient().getDataphinClient();

        CreateJdbcConnectionRequest request = new CreateJdbcConnectionRequest();
        request.setProjectName("ads_app_blacklst_sit");
        request.setOpTenantId(300002005L);
        CreateJdbcConnectionResponse createJdbcConnectionResponse = dataphinAcsClient.getAcsResponse(request);
        String sessionId = createJdbcConnectionResponse.getSessionId();
        System.out.println(sessionId);


        ExecSqlByJdbcRequest execSqlByJdbcRequest = new ExecSqlByJdbcRequest();
        execSqlByJdbcRequest.setProjectName("ads_app_blacklst_sit");
        execSqlByJdbcRequest.setSessionId(sessionId);
        execSqlByJdbcRequest.setOpTenantId(300002005L);
        execSqlByJdbcRequest.setCodeBody("select \n" +
                "     e2e_id\n" +
                "\t,process_id\n" +
                "\t,process_group_id\n" +
                "\t,process_type_id\n" +
                "\t,process_name\n" +
                "\t,process_code\n" +
                "\t,process_l3po\n" +
                "\t,process_l2po\n" +
                "\t,process_l1po\n" +
                "\t,process_manager\n" +
                "\t,process_trigger_event\n" +
                "\t,process_created_at\n" +
                "\t,process_updated_at\n" +
                "\t,process_published_at\n" +
                "\t,`status`\n" +
                "\t,approval_status\n" +
                "\t,process_desc\n" +
                "\t,process_purpose\n" +
                "\t,application_scope \n" +
                "\t,process_handbook\n" +
                "\t,process_handbook_link \n" +
                "\t,activity_id\n" +
                "\t,activity_name\n" +
                "\t,activity_code \n" +
                "\t,activity_type\n" +
                "\t,activity_desc\n" +
                "\t,product_code\n" +
                "\t,product_name\n" +
                "\t,role_post_id\n" +
                "\t,role_id\n" +
                "\t,role_name\n" +
                "\t,role_is_public\n" +
                "\t,post_id\n" +
                "\t,post_name\n" +
                "from imp_ads_app_einfo_dws_aris_process_detail_df");
        ExecSqlByJdbcResponse execSqlByJdbcResponse = dataphinAcsClient.getAcsResponse(execSqlByJdbcRequest);
        System.out.println(execSqlByJdbcResponse.getTaskId());


    }
}
