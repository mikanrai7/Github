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
