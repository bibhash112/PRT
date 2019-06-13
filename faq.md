---
title: "FAQ"

weight: 3
---

-   [Not able to login to uDeploy and not able to see my application uDeploy.](#1)
    
-   [I am not able to see my application in uDeploy.](#2)
    
-   [How to modify the AD group for our application as we have done segregation of duties.](#3)
    
-   [Should we suppose to submit separate stack creation requests for Dev, Stage, LT& Prod lifecycles of my Application?](#4)
    
-   [For one application, POM file was not published to artifactory and hence uDeploy could not download the exact file it was looking for.](#5)
    
-   [Build is successful, but version import is failing in uDeploy or Latest Versions are not getting imported in UDeploy; getting a notification as “Version import failed! Check the component’s configuration for more details”:](#6)
    
-   [uDeploy is able to pick the artifact from the artifactory but it is not starting the deployment](#7)
    
-   [How do I change the Artifact ID for my already provisioned application in uDeploy?](#8)
    
-   [How to deploy the code manually in uDeploy?](#9)
    
-   [How to check the deployment log?](#10)
    
-   [How to create a snapshot for the release?](#11)
    
-   [How to schedule the deployment in udeploy?](#12)
    
-   [I have created a snapshot in uDeploy still I am not able to see in uRelease?](#13)
    
-   [How to schedule the deployment in uRelease?](#14)
    
-   [In uRelease, Gate Status is Failed ,1 Missing Quality Status, CI Setup(Failed) is shown when trying to deploy](#15)
    
-   [I have schedule a deployment in uRelease but deployment has not started automatically?](#16)
    
-   [After snapshot creation, Start Deployment button was not available.](#17)
    
-   [Deployment successful in uDeploy, but latest war file is not updated to tomcat Dev/Stage/Prod server](#18)
    
-   [How to deploy an old version in udeploy](#19)
    
-   [Version import is taking a lot of time, would be started 2 hours back and still in Executing status.](#20)
    
-   [Deletion of a sDaaS stack required due to inappropriate information provided](#21)
    
-   [Latest snapshot not getting updated quickly in uRelease](#22)
    
-   [Deployment is successful in uDeploy but the restart of CCIX application is not happening after deployment to dev/stage/lt/prod](#23)
    
-   [Submitted SdaaS request # , however it is still showing 0% complete.](#24)
    
-   [For one application, steps are not present in application process.](#25)
    
-   [User not able to see Application in pipeline view but stack is configured.](#26)
    
-   [Build is not proper as it is going to ext-release-local instead of ext-snapshot-local](#27)
    
-   [While trying to add Quality Status,user does not see the required quality status/gate in dropdown (Ex:CI Setup)  
    image021.jpg](#28)
    
-   [While migrating a project from ANT to MAVEN, user will need to upload jars to Cisco Repository.](#29)
    
-   [How to restore the deployment task if accidentally deleted by a team member?](#30)
    
-   [How to add or apply the freeze to our applications.](#31)
    
-   [Failed to start Task: problem with doOnURl](#32)
    
-   [How can I deploy old snapshot in URelease?](#33)
    
-   [Udeploy Deployment fails with the Error: Deployment has failed in UDeploy with the error output “jbossews process failed to start” and “Error deploying local file. You can try to deploy manually with:ssh –t…”](#34)
    
-   [How to promote snapshot from Dev to Upper Environments?](#35)
    
-   [How to add a new environment in Udeploy and URelease?](#36)
    
-   [User not able to access uDeploy although he is a part of AD group specified while raising Sdaas stack. (AD Sync issue)](#37)
    
-   [While ordering for SdaaS stack the below error occurs for user](#38)
    
-   [How to set email notifications for any deployments/task/segments in uRelease?](#39)
    
-   [How to check whether the application is SOX or NON-SOX application?](#40)
    
-   [How to request membership for particular AD group?](#41)
    
-   [How to import version manually?](#42)
    
-   [How to create build for multistack application?](#44)
    
-   [What needs to be done when the deployment log shows version already installed?](#44)
    
-   [How to change Informatica SOX application to NON SOX application?](#45)
    
-   [Unable to approve Snapshot for PROD deployment?](#46)
    
-   [Passsed Validation Gate not added?](#47)
    
-   [Teradata Deployment Guide.](#48)
    
-   [uDeploy User Guide for OBIEE.](#49)
    
-   [Change/Setup environment variable in SFDC workflow in uDeploy](#50)
    
-   [What to do if no Sys ID gate is getting added in uRelease ?](#51)
    
-   [What to do if application is Non-SOX in uDeploy but SOX gate is added in uRelease OR vice versa](#52)
    
-   [Gate failed as waiting to join event/ Release ?](#53)
    
-   [Version not imported to udeploy for CAE applications](#54)
    
-   [Sox validation in uDeploy/uRelease through Rally .](#55)
    
-   [Snapshots failing at SOX validation step (Rally).](#56)
    
-   [Tags not imported in uDeploy for CAE application.](#57)
    
-   [If no tags are found in Quay(containers.cisco.com) even after the Jenkins build, then below snippet has to be added from the Jenkins end.](#58)
    
-   [How deploy a SOX application in PROD environment without joining a Release event(Non-CDRM) in URelease.](#59)



### <a id="1"> </a> Q1) Not able to login to uDeploy and not able to see my application uDeploy.
	     Please contact your application admin and get access to Development AD group to get the access for your application	   
    
### <a id="2"> </a>Q2) I am not able to see my application in uDeploy.
    
		- Could you please check in your sDaaS you have selected Software Release Automation as Yes or No.
        - If you selected as No please go to modify request from Estore and change it to  Yes  fill the required fields and submit the request.
![image001.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/9554da8c-fc38-4eb1-ac81-baef29cb66a7/media/V15_image001.png?preventCache=1552310394905)

        
### <a id="3"> </a> Q3) How to modify the AD group for our application as we have done segrigation of duties.
    
	     Please go to modify request from Estore and select your application.
![image002.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/fe4cc408-b29b-4bff-8fdd-26db1e425026/media/V15_image002.png?preventCache=1552310394905)

	     It will auto populate the all the details please do necessary changes and submit the request.
   ![image003.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/15d49994-6037-4a7c-9151-a267cc3cfd5f/media/V15_image003.png?preventCache=1552310394905)
    

### <a id="4"> </a> Q4) Should we suppose to submit separate stack creation requests for Dev, Stage, LT& Prod lifecycles of my Application?]
    
	     Stack can be ordered for all the available lifecycles in a single order. If you have requested only Dev for now and if you want to request other life cycle you can use sDaaS modify request from Estore.

    

### <a id="5"> </a>Q5)  For  one application, POM file was not published to artifactory and hence uDeploy could not download the exact file it was looking for.
    
	     After including **.pom in Jenkins configuration include pattern and generating a new build, the required POM and tar.gz files are pushed to Artifactory & uDeploy is able to pull the file from artifactory successfully.
![image004.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/64c89a74-7517-4cdc-9a1a-1d05c0ab0391/media/V15_image004.png?preventCache=1552310394905)
    

### <a id="6"> </a>Q6) Build  is successful, but version import is failing in uDeploy or Latest Versions are not getting imported in UDeploy; getting a notification as “Version import failed! Check the component’s configuration for more details”:
    
	     Please check if "Import Versions Automatically" section has been checked in UDeploy's Component configuration of the specific application as it has to be checked for versions to import automatically into UDeploy, else the version has to be imported manually.
![](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/e73f2b8f-d46a-479e-a44b-f3d5ac148ce0/media/V15_pastedImage_88.png?preventCache=1552310394905)
    
	 -  Please do verify the artifactory configuration in UDeploy’s Component Configuration i.e. Repository, Group ID, Artifact ID are configured correctly. These data should match with Artifactory’s POM.xml file. Please ensure POM.xml has sufficient and correct data in it to get the latest version in UDeploy and the deployment to go on successfully.
	 -  Also maven-metadata.xml has to be present in the artifactory's project folder.
     -  In artifactory’s maven-metadata.xml, check if the latest version has mapped and the latest version folder is present in ascending order with the latest time stamp.
     -  If any mismatch found in Udeploy and artifactory configuration, if you would want to change the configuration in udeploy then it can be modified through estore’s SDaaS Modify option
    

### <a id="7"> </a>Q7) uDeploy is able to pick the artifact from the artifactory but it is not starting the deployment
    
      -  “Run process after creating a new version “field is not selected in component configuration to
    
    run the process automatically for new version imports. Please enable this option.
    
    Home > Components > {application} > Configuration 
  ![image006.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/95d7eac3-4228-40d5-88bb-f367d5237369/media/V15_image006.png?preventCache=1552310394905)
    
     -   Please do verify the version number in both Artifactory and Udeploy’s Component Configuration.
     -   If the build is not uploaded in artifactory, then please do check the Jenkins configuration.
     -   If the latest version is present in artifactory and not par with Udeploy, then check & correct the configuration as in the 6th FAQ (Latest Versions are not getting imported in U-Deploy; getting as “Version import failed! Check your component configuration”). If in case not able to resolve the issue, then please do raise a ticket to SRA-Tier1 in Service now under Release Automation service offering or contact  [sra-sdaas-support@cisco.com](mailto:sra-sdaas-support@cisco.com).
 
      
### <a id="8"> </a>Q8)  How  do I change the Artifact ID for my already provisioned application in uDeploy?
    
         Go to estore sDaas Modify Request http://estore.cisco.com/RequestCenter/servicecatalog/servicecatalog.do?route=offer&id=655 and order for the change of artifact Id .

    
### <a id="9"> </a>Q9) How to deploy the code manually in uDeploy?
    
      -  In uDeploy navigate to  Applications>  go to your application > in environment tab there will be
    
    environments > in that play button will be there please click on that.
 ![image007.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/fcdc5972-ee46-46d2-a6c9-a7ab0896f3e6/media/1_V15_image007.png?preventCache=1552310394905)
    
        However it is recommended to use uRelease to deploy to any non-Dev environment to not to violate SOX . 

    
### <a id="10"> </a>Q10) how to check the deployment log?
    
    -   In uDeploy navigate to Applications> go to your application > in environment tab there will be environments> click on the environment dropdown > click on view request there you will see the details log   
 ![image008.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/6aef085f-ea00-4540-9ef9-186cb68ed3f7/media/V15_image008.png?preventCache=1552310394905) 

### <a id="11"> </a>Q11) How to create a snapshot for the release?
    
    -   In uDeploy navigate to Applications> go to your application > in environment tab there will be environments> click on camera button or go to snapshot tab and click on create
    
   [![image007.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/1c59d1aa-c1b3-4b5b-b034-3eab71171b88/media/V15_image007.png?preventCache=1552310394905)](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/1c59d1aa-c1b3-4b5b-b034-3eab71171b88/media/V15_image007.png)
    
### <a id="12"> </a>Q12) How to schedule the deployment in udeploy?
    
    -   In uDeploy navigate to Calendar > click on Schedule process > select the application, process, date and time
    
    
### <a id="13"> </a>Q13) I have created a snapshot in uDeploy still I am not able to see in uRelease?
    
    -   Once you create snapshot you need to wait for 10 min to integrate it with uRelease.
    
        
### <a id="14"> </a>Q14) How to schedule the deployment in uRelease?
    
    -   In uRelease navigate Deployments> Add New Scheduled Deployment > select the release  name ,  phase and versions with schedule date and time.
    
    
### <a id="15"> </a>Q15) In  uRelease, Gate Status is Failed ,1 Missing Quality Status, CI Setup(Failed) is shown when trying to deploy
    
    -   User needs to go to Execution and Deployment Plan and add the missing Gate (CI Setup) by clicking on the + symbol under Quality Status
![image010.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/1290b0ab-d18e-4690-ba49-833dc898a00b/media/V15_image010.png?preventCache=1552310394905)



