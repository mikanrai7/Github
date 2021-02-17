//This will launch the report and place the file in the specified folder

import sailpoint.object.*;
import sailpoint.api.*;
import java.util.*;
import sailpoint.tools.*;

String reportName = "Oracle Account Disabled Report";
String fileLocation = "E:\\Tasks\\Disabled Account Report";

//Initiating the task by instantiating a TaskManager and calling RunSync() method for running the task
TaskManager tm = new TaskManager(context);
TaskResult result = tm.runSync(reportName,new HashMap());

if(null !=result) {
    JasperResult jr = result.getReport();
}
if(null != jr){
    List fileList = jr.getFiles();
    for(PersistedFile file: fileList){
        if(file.isCsv()){
            String byteString = "";
            SimpleDateFormat sdf = new SimpleDateFormat("MMddyyyy-HH-mm-ss");
            Date date = new Date();
            String fileName = file.getName().substring(0,file.getName().indexOf(".csv")) + "_" + sdf.format(date)+ ".csv";
            QueryOptions qo = new QueryOptions();
            Filter ft = Filter.eq("parent",file);
            qo.addFilter(ft);
            qo.addOrdering("fileIndex",true)
        }
    }
}