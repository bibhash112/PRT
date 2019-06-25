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
    
-   [QDeployment successful in uDeploy, but latest war file is not updated to tomcat Dev/Stage/Prod server](#18)
    
-   [How to deploy an old version in udeploy](#19)
    
-   [Version import is taking a lot of time, would be started 2 hours back and still in Executing status.](#20)
    
-   [Deletion of a sDaaS stack required due to inappropriate information provided](#21)
    
-   [Latest snapshot not getting updated quickly in uRelease](#22)
    
-   [Deployment is successful in uDeploy but the restart of CCIX application is not happening after deployment to dev/stage/lt/prod](#23)
    
-   [Submitted SdaaS request # , however it is still showing 0% complete.](#24)
    
-   [For one application, steps are not present in application process.](#25)
    
-   [User not able to see Application in pipeline view but stack is configured.](#26)
    
-   [Build is not proper as it is going to ext-release-local instead of ext-snapshot-local](#27)
    
-   [While trying to add Quality Status,user does not see the required quality status/gate in dropdown (Ex:CI Setup)](#28)
    
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


### <a id="1"> </a> Not able to login to uDeploy and not able to see my application uDeploy.
Please contact your application admin and get access to Development AD group to get the access for your application	   
    
### <a id="2"> </a> I am not able to see my application in uDeploy.
    
- Could you please check in your sDaaS you have selected Software Release Automation as Yes or No.
- If you selected as No please go to modify request from Estore and change it to  Yes  fill the required fields and submit the request.
![image001.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/9554da8c-fc38-4eb1-ac81-baef29cb66a7/media/V15_image001.png?preventCache=1552310394905)

        
### <a id="3"> </a> How to modify the AD group for our application as we have done segrigation of duties.
    
Please go to modify request from Estore and select your application.
![image002.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/fe4cc408-b29b-4bff-8fdd-26db1e425026/media/V15_image002.png?preventCache=1552310394905)

 It will auto populate the all the details please do necessary changes and submit the request.
![image003.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/15d49994-6037-4a7c-9151-a267cc3cfd5f/media/V15_image003.png?preventCache=1552310394905)
    

### <a id="4"> </a> Should we suppose to submit separate stack creation requests for Dev, Stage, LT& Prod lifecycles of my Application?]
    
Stack can be ordered for all the available lifecycles in a single order. If you have requested only Dev for now and if you want to request other life cycle you can use sDaaS modify request from Estore.

    

### <a id="5"> </a> For  one application, POM file was not published to artifactory and hence uDeploy could not download the exact file it was looking for.
    
After including **.pom in Jenkins configuration include pattern and generating a new build, the required POM and tar.gz files are pushed to Artifactory & uDeploy is able to pull the file from artifactory successfully.
![image004.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/64c89a74-7517-4cdc-9a1a-1d05c0ab0391/media/V15_image004.png?preventCache=1552310394905)
    

### <a id="6"> </a> Build  is successful, but version import is failing in uDeploy or Latest Versions are not getting imported in UDeploy; getting a notification as “Version import failed! Check the component’s configuration for more details”:
    
Please check if "Import Versions Automatically" section has been checked in UDeploy's Component configuration of the specific application as it has to be checked for versions to import automatically into UDeploy, else the version has to be imported manually.
![](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/e73f2b8f-d46a-479e-a44b-f3d5ac148ce0/media/V15_pastedImage_88.png?preventCache=1552310394905)
    
-  Please do verify the artifactory configuration in UDeploy’s Component Configuration i.e. Repository, Group ID, Artifact ID are configured correctly. These data should match with Artifactory’s POM.xml file. Please ensure POM.xml has sufficient and correct data in it to get the latest version in UDeploy and the deployment to go on successfully.
-  Also maven-metadata.xml has to be present in the artifactory's project folder.
-  In artifactory’s maven-metadata.xml, check if the latest version has mapped and the latest version folder is present in ascending order with the latest time stamp.
-  If any mismatch found in Udeploy and artifactory configuration, if you would want to change the configuration in udeploy then it can be modified through estore’s SDaaS Modify option
    

### <a id="7"> </a> uDeploy is able to pick the artifact from the artifactory but it is not starting the deployment
    
-  “Run process after creating a new version “field is not selected in component configuration to run the process automatically for new version imports. Please enable this option.
    
Home > Components > {application} > Configuration 
![image006.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/95d7eac3-4228-40d5-88bb-f367d5237369/media/V15_image006.png?preventCache=1552310394905)
    
-   Please do verify the version number in both Artifactory and Udeploy’s Component Configuration
-   If the build is not uploaded in artifactory, then please do check the Jenkins configuration.
-   If the latest version is present in artifactory and not par with Udeploy, then check & correct the configuration as in the 6th FAQ (Latest Versions are not getting imported in U-Deploy; getting as “Version import failed! Check your component configuration”). If in case not able to resolve the issue, then please do raise a ticket to SRA-Tier1 in Service now under Release Automation service offering or contact  [sra-sdaas-support@cisco.com](mailto:sra-sdaas-support@cisco.com).
 
      
### <a id="8"> </a>  How  do I change the Artifact ID for my already provisioned application in uDeploy?
    
Go to estore sDaas Modify Request http://estore.cisco.com/RequestCenter/servicecatalog/servicecatalog.do?route=offer&id=655 and order for the change of artifact Id .

    
### <a id="9"> </a> How to deploy the code manually in uDeploy?
    
-  In uDeploy navigate to  Applications>  go to your application > in environment tab there will be
    
environments > in that play button will be there please click on that.
![image007.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/fcdc5972-ee46-46d2-a6c9-a7ab0896f3e6/media/1_V15_image007.png?preventCache=1552310394905)
    
However it is recommended to use uRelease to deploy to any non-Dev environment to not to violate SOX . 

    
### <a id="10"> </a> how to check the deployment log?
    
-   In uDeploy navigate to Applications> go to your application > in environment tab there will be environments> click on the environment dropdown > click on view request there you will see the details log   
![image008.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/6aef085f-ea00-4540-9ef9-186cb68ed3f7/media/V15_image008.png?preventCache=1552310394905) 

### <a id="11"> </a> How to create a snapshot for the release?
    
-   In uDeploy navigate to Applications> go to your application > in environment tab there will be environments> click on camera button or go to snapshot tab and click on create
![image007.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/1c59d1aa-c1b3-4b5b-b034-3eab71171b88/media/V15_image007.png?preventCache=1552310394905)   
    
### <a id="12"> </a> How to schedule the deployment in udeploy?
    
-   In uDeploy navigate to Calendar > click on Schedule process > select the application, process, date and time
    
    
### <a id="13"> </a> I have created a snapshot in uDeploy still I am not able to see in uRelease?
    
-  Once you create snapshot you need to wait for 10 min to integrate it with uRelease.
    
        
### <a id="14"> </a> How to schedule the deployment in uRelease?
    
-   In uRelease navigate Deployments> Add New Scheduled Deployment > select the release  name ,  phase and versions with schedule date and time.
    
    
### <a id="15"> </a> In  uRelease, Gate Status is Failed ,1 Missing Quality Status, CI Setup(Failed) is shown when trying to deploy
    
-   User needs to go to Execution and Deployment Plan and add the missing Gate (CI Setup) by clicking on the + symbol under Quality Status
![image010.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/1290b0ab-d18e-4690-ba49-833dc898a00b/media/V15_image010.png?preventCache=1552310394905)
    
### <a id="16"> </a> I have schedule a deployment in uRelease but deployment has not started automatically?
    
-   Once you schedule a deployment please check you have started the deployment in that release or not please check is all gates are approved or passed or not.
-   If you are manually starting the deployment , please click on the next start button for the deployment task .

### <a id="17"> </a> After snapshot creation, Start Deployment button was not available.
    
-   Please contact you application admin and subscribe for Application admin AD group from http://adam.cisco.com
    
### <a id="18"> </a> Deployment successful in uDeploy, but latest war file is not updated to tomcat Dev/Stage/Prod server
    
-   Please contact platform team .
-   LAE platform - lae-operations@cisco.com
-   AWS Team (CCIX) - gs-pss-wipro@cisco.com
    
### <a id="19"> </a> How to deploy an old version in udeploy
    
-   Create a new snapshot by selecting the version which you wanted to deploy.
    
Home > Applications > {your application} > Snapshots > Snapshot: {name} > Component Versions > add
![image011.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/5cd536bc-6ca1-409d-a120-d222b591007c/media/V15_image011.png?preventCache=1552310394905)

### <a id="20"> </a> Version import is taking a lot of  time,  would be started 2 hours back and still in Executing status.
    
-   Please raise a case in SRM (search with uDeploy)
![image012.jpg](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/b4f6a53f-efde-4630-a615-c213306e46b6/media/V15_image012.jpg?preventCache=1552310394905)   
 
    
### <a id="21"> </a> Deletion of  a  sDaaS stack required due to inappropriate information provided
    
-   Please go to Estore search with SDaaS and there is delete request for deleting the SDaaS stack
![image015.jpg](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/8ab1a12e-02ba-413a-b10d-675065dd1aee/media/V15_image015.jpg?preventCache=1552310394905)
    
### <a id="22"> </a> Latest snapshot not getting updated quickly in uRelease
    
-   There is a 15minute cycle for pulling the latest snapshots from uDeploy. As there are many snapshots to be pulled it will take some time.
        
### <a id="23"> </a> Deployment is successful in uDeploy but the restart of CCIX application is not happening after deployment to dev/stage/lt/prod
    
-   Please contact AWS Team (gs-pss-wipro@cisco.com)
    
### <a id="24"> </a> Submitted SdaaS request  # ,  however it is still showing 0% complete.
    
-   Please contact PaaS  Team(citeis-paas-support@cisco.com)
    
    
### <a id="25"> </a>  For  one application, steps are not present in application process.
    
-   Please raise a case in Service Now (service offering -Release Automation)
    
    
### <a id="26"> </a> User not able to see Application in pipeline view but stack is configured.
    
-   Application admin should check if the setup is fine .If everything looks good with the setup, check QA AD Group and ask user to request membership for that AD Group from ADAM (http://adam.cisco.com/)
   
    
### <a id="27"> </a> Build is not proper as it is going to ext-release-local instead of ext-snapshot-local
    
There can be two possibilities:
    
1.  Check whether the Configuration settings in Jenkins are as below. If not, Request application  team to change the path in Jenkins build.
![image017.jpg](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/c475c306-50b1-4d7d-97c6-89d2207042ea/media/V15_image017.jpg?preventCache=1552310394905)
    
2.  Check the version number in pom.xml file. It has to be in XXX-SNAPSHOT format.
    
Ex: 1.0.0-SNAPSHOT 
![image019.jpg](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/d282aaa1-2533-4022-bb48-ae6f4070c49b/media/V15_image019.jpg?preventCache=1552310394905)
    
### <a id="28"> </a> While  trying to add Quality Status,user does not see the required quality status/gate in dropdown (Ex:CI Setup)
    
![image021.jpg](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/366132db-c21b-4c22-b54b-8d7463d2bd2d/media/V15_image021.jpg?preventCache=1552310394905)
    
-   User needs to check with Application admin as he needs to subscribe himself for the application admin ad group from ADAM (http://adam.cisco.com/).
       
### <a id="29"> </a> While  migrating a project from ANT to MAVEN, user will need to upload jars to Cisco Repository.
    
-   You can raise an estore sdaas  request[In estore search for Sdaas] with target environment as ‘Artifactory’ and Artifactory Access type as ‘Public’.
-   Once raised, a confirmation mail will be received with the artifactory URL Details for uploading their files.
![image025.jpg](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/e1287808-86c0-4ba1-ad62-8207c4f76b49/media/V15_image025.jpg?preventCache=1552310394905)
    
### <a id="30"> </a> How to restore the deployment task if accidentally deleted by a team member?
    
When user is trying to start deployment for the application in stage, getting error “This deployment plan does not contain any runnable tasks” User not able to see pre-deployment tasks being populated and unable to create automated task
![image026.jpg](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/6a94b307-658e-481c-a56b-4d420a8bf170/media/V15_image026.jpg?preventCache=1552310394905)
    
User deleted the deployment task by  mistake,  application admins will be able to add the task
    
1.  back to resolve the issue by clicking on Add Automated task and selecting taskà Save
    
CASE 1: If deployment task exist only autoated task is missing please follow below step
    
Step 1: add the atuomated task
![image032.jpg](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/56db4427-e6ca-41ec-ac08-fa67f5ad9793/media/1_V15_image032.jpg?preventCache=1552310394905)
    
CASE 2: If Deployment task it self is deleted
    
Step1: click on Create segment please follow below step
![image029.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/a97b80ba-5911-4a77-b91a-1094d062f943/media/V15_image029.png?preventCache=1552310394905)   
Step to fill the details as below[![image031.jpg](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/95ec13b6-5c46-439c-b5f7-b7cafb739c37/media/V15_image031.jpg?preventCache=1552310394905)
    
Step 3: add the atuomated task
![image032.jpg](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/cab55902-2aa7-4b94-b13f-f36c985c0c02/media/V15_image032.jpg?preventCache=1552310394905) 
   
### <a id="31"> </a> How to add or apply the freeze to our applications.
    
-   For adding or applying Freeze, you can add it in Blackout plan for your applications in uDeploy (uDeploy > Applications > Environments > Calendar)
![image033.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/0854401e-bbcc-4385-9653-edb4b3dba333/media/V15_image033.png?preventCache=1552310394905)       
    
### <a id="32"> </a> Failed to start Task: problem with doOnURl
    
-   As seen in below screen shot you will notice “Failed to start Task: problem with doOnURl”
![image035.jpg](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/f08933d2-c19d-425c-a8df-4e70a53cca42/media/V15_image035.jpg?preventCache=1552310394905)
    
-   This is due to version wont be there in snapshot. We need to add in snapshot. Click on snapshot à component version add.
![image036.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/c5cc1d47-5e7e-4ea8-834d-cfb8c51fe719/media/V15_image036.png?preventCache=1552310394905)
    
![image038.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/526fcfc4-4d36-47fd-9079-4ba70c47ac15/media/V15_image038.png?preventCache=1552310394905)
    
### <a id="33"> </a> How can I deploy old snapshot in URelease?
    
-   In the pipeline view, drag and drop the latest release to the target environment as you normally would.
-   In the environment, click on the time stamp for the scheduled release.
-   In the Upcoming Deployment popup, click on link for “View Execution and Deployment Plan.”
-   When the Deployment Plan screen appears, click on the Contents & Notifications tab.
-   In Deployment Contents, click the edit option at the right side of the entry for the deployment.
-   This will make the version a drop-down. Pick the older snapshot you want and save the changes.
    
    
### <a id="34"> </a> Udeploy Deployment fails with the Error: Deployment has failed in UDeploy with the error output “jbossews process failed to start” and “Error deploying local file. You can try to deploy manually with:ssh –t..”

-   Please do contact LAE team - "lae-operations".
    
![](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/d46a23fc-9081-40fb-b1a8-b2f1f3b32af0/media/5_V15_pastedImage_3.png?preventCache=1552310394905)](https://apps.na.collabserv.com/wikis/home/wiki/W8a035710e5dd_4861_adc6_1db5506a4cab/page/uDeploy%20and%20uRelease%20FAQs)
    
### <a id="35"> </a> How to promote snapshot from Dev to Upper Environments?
    
-   Login to uRelease (https://release.cisco.com/login) using your CEC credentials
![](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/ad21353a-53ee-4a52-a2be-c235165edf68/media/V15_pastedImage_99.png?preventCache=1552310394905)  
    
-   Click on the Pipeline View and select the application from the drop down list that you wish to deploy
-   In the NEWEST section users will see the latest snapshot being pulled into uRelease
-   Drag and drop the snapshot to the environment to which the next deployment has to go as in the below screenshot.
![](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/28f33f45-f650-421b-b49d-4e538d7fb926/media/V15_pastedImage_101.png?preventCache=1552310394905)
    
    
-   After the drag and drop, you have to schedule as in below screenshot.
    
![](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/7746725d-4a0e-41f3-9a6c-31918116e144/media/V15_pastedImage_103.png?preventCache=1552310394905)
    
-   Check "Start Automatically" to start the deployment automatically
-   Users can then trigger deployment from Deployment Plan to trigger it manually.
-   Click on the scheduled time and then the "View Execution & Deployment Plan" link to proceed with manual deployment.
-   Note: Please ensure there is no Gates/Approval pending to proceed further.
-   Click on the Start Deployment button to trigger the deployment manually.
-   Once all approvals are in place, from the Deployment Tasks section please click on the Start button and you can then monitor the progress of the application deployment from here or in uDeploy.
    
### <a id="36"> </a> How to add a new environment in Udeploy and URelease?
    
-   Please use SDaaS Modify in Estore (http://estore.cisco.com/RequestCenter/servicecatalog/servicecatalog.do?route=offer&id=655)and request in "Life Cycle Details" section for the environment which you want to be added.
    
### <a id="37"> </a> User not able to access uDeploy although he is a part of AD group specified while raising Sdaas stack. (AD Sync issue)
    
![Q36.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/8e3b570b-4bd8-45c1-b0d2-3d124ab43a4e/media/V15_Q36.png?preventCache=1552310394905)
    
    -   Need to update the user in uDeploy. Please raise a case with sra-tier1
    
### <a id="38"> </a>  While ordering for SdaaS stack the below error occurs for user

![38.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/58c37c30-5f0c-45ab-8495-641af2baf6d9/media/V15_38.png?preventCache=1552310394905)    
   
-   please use other than ‘ / ‘ and ‘ _ ‘ as they are not allowed in directory path, suggested by CITEIS PaaS Support Team
    
    
### <a id="39"> </a>  How to set email notifications for any deployments/task/segments in uRelease?
    
-   Under Notification Configuration you can create notifications for Start/Fail/Finish of Deployment/Task/Segment
   
    
![39.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/0b1a1aee-4208-464d-8594-f8ecda0ebc1a/media/V15_39.png?preventCache=1552310394905)
    
-   Mail received will be of below format:
    
![29A.png](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/ff93b099-3fce-47b0-bcc0-074d7df9bea7/media/V15_29A.png?preventCache=1552310394905)
    
### <a id="40"> </a> How to check whether the application is SOX or NON-SOX application?
-   Login to uDeploy [https://deploy.cisco.com:8443/](https://deploy.cisco.com:8443/)
![](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/21087611-6b85-4b3e-8796-2e6c878b91a7/media/V15_pastedImage_21.png?preventCache=1552310394905) 

-   Open your application; Navigate to application -> configuration. Click on application properties on the left.
-   If SOX value is false then application is NON sox application; if it’s true then the application is SOX application.
![](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/5b5f52de-152e-4e4f-8856-b0363173bfb3/media/V15_pastedImage_23.png?preventCache=1552310394905)
    
### <a id="41"> </a> How to request membership for particular AD group?
 
-   login to ADAM's Account [http://adam.cisco.com/](http://adam.cisco.com/)
-   Goto Group Search, search for AD Group name which you have or our team has shared with you.
![](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/f06bad45-44a5-44b4-b1dc-3b249c54e7b1/media/V15_pastedImage_24.png?preventCache=1552310394905)
    
-   Then please click on request membership and provide justification.
-   Notify the owners and once the owners approve it, you would be part of that group.
    
### <a id="42"> </a> How to import version manually?
    
-   login to uDeploy [https://deploy.cisco.com:8443/](https://deploy.cisco.com:8443/)
-   Navigate to the application and click on the application name
-   There will be sub-tabs for that application such as Environment, History, Components etc, select the component tab and click on the component name
-   Navigate to versions tab
-   Click on import version mamually, click on save without select anything, it will import the latest version from artifactory.

    
### <a id="43"> </a> How to create build for multistack application?
    
Refer to the JIVE page https://cisco.jiveon.com/docs/DOC-101972 (https://apps.na.collabserv.com/wikis/home/wiki/W4ae5df2fa9b8_419b_8361_46b3d6f6ebda/page/Software%20Development%20Stack%20%28SDaaS%29%20for%20Advanced%20Deployment%20%28LAE%29) for step by step instructions.
    
    
### <a id="44"> </a> What needs to be done when the deployment log shows version already installed?
      
-   This indicates that the snapshot was created with already deployed version.
-   Schedule a new deployment
-   Double click on the Process “deploy” for the application
    
![](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/ba13a9c8-e8b6-4071-99e4-0d099a34e1ef/media/V15_pastedImage_25.png?preventCache=1552310394905)
    
-   Wait for the Application Name to be Populated
    
![](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/998c84c7-dc7f-4153-9814-178e5acaf6a3/media/V15_pastedImage_26.png?preventCache=1552310394905)
    
-   Navigate to the Advanced Tab. Uncheck “Only Changed Versions” and Click on Save
![](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/68bd9325-6f78-4ef7-99a1-a4264727eb6b/media/V15_pastedImage_27.png?preventCache=1552310394905)
    
-   Trigger the deployment manually or wait for it to start automatically.
    
### <a id="45"> </a> How to change Informatica SOX application to NON SOX application?
    
Please raise a case with proper justification if there is a request to change any Teradata/Informatica applications from Non-SOX to SOX or vice versa as that requires configuration changes in uRelease as well which only SRA team can perform.

    
### <a id="46"> </a> Unable to approve Snapshot for PROD deployment?
    
User should have sufficent privileges to approve for prod and should be part of the IT Manager ADAM group.
    
### <a id="47"> </a> Passsed Validation Gate not added?
    
Following criteria should be met for the “Passed Validation” gate to be added dynamically:    
    -   Unique Approvers for Prod and Non-Prod
    -   Snapshot should be deployed to any one of the Non-Prod env that has approvals set.
    -   There should be one schedule/application/snapshot and the snapshot should be approved
    -   Any deployments should take place via uRelease
    -   Check if there are any duplicate schedules
    
### <a id="48"> </a> Teradata Deployment Guide.
    
Please follow the below jive page https://cisco.jiveon.com/docs/DOC-710333 (https://apps.na.collabserv.com/wikis/home/wiki/W3213ca86d305_4c1a_b111_89b8dadb845e/page/Teradata%20Deployment%20Guide) Teradata Deployment Guide

### <a id="49"> </a> uDeploy User Guide for OBIEE.
    
Please follow the below jive page https://cisco.jiveon.com/docs/DOC-24089    (https://apps.na.collabserv.com/wikis/home/wiki/Wbfdcbc9fda6c_43c5_a5fe_cf0bd3fce99a/page/SRA%20uDeploy%20User%20Guide%20For%20OBIEE) SRA uDeploy User Guide For OBIEE
    
### <a id="50"> </a> Change/Setup environment variable in SFDC workflow in uDeploy
    
Go to the particular environment in application, make required changes in Environment configuration -> Environment properties
    
### <a id="51"> </a> What to do if no Sys ID gate is getting added in uRelease ?
    
Please contact sra-sdaas-support@cisco.com to add the sys Id in uRelease.
    
### <a id="52"> </a> What to do if application is Non-SOX in uDeploy but SOX gate is added in uRelease OR vice versa ?
    
Please reach out to SRA ops team to make it non-sox in uRelease or vice-versa.
    
    
### <a id="53"> </a> Gate failed as waiting to join event/ Release ?
    
Go to View Execution and Deployment > Overview> Join event
    
### <a id="54"> </a> Version not imported to udeploy for CAE applications
    
Please delete tags from container.cisco.com . Version is not imported in uDeploy if the tags are more than 50 in the container.
    
### <a id="55"> </a> Sox validation in uDeploy/uRelease through Rally .
    
Refer SOX Validation in uDeploy/uRelease through Rally (https://apps.na.collabserv.com/wikis/home/wiki/W52d8c1c91d6a_41eb_a30f_021c10f3ec18/page/SOX%20Validation%20in%20uDeployuRelease%20through%20Rally%C2%A0)
    
### <a id="56"> </a> Snapshots failing at SOX validation step (Rally).
    
Refer https://cisco.jiveon.com/docs/DOC-1913239#jive_content_id_SNAPSHOTS_are_failing_inat_UDeployARRT_setup	(https://apps.na.collabserv.com/wikis/home/wiki/W8a035710e5dd_4861_adc6_1db5506a4cab/page/uDeploy%20and%20uRelease%20FAQs?lang=en-us&section=jive_content_id_SNAPSHOTS_are_failing_inat_UDeployARRT_setup)
    
### <a id="57"> </a> Tags not imported in uDeploy for CAE application.
    
Please validate the below points :
    
1.Check the repo path is correct.
    
2.Verify if the tag is available in that path.
    
3.If still unable to import, goto containers.cisco.com and check the lists of tags. In case if the number of tags are more than 150, then user need to delete the unwanted among them.
    
(For the deletion user need to involve ECM team also). Then only the tags will get import to the udeploy.
    
### <a id="57"> </a> If no tags are found in Quay(containers.cisco.com) even after the Jenkins build, then below snippet has to be added from the Jenkins end.
    
No action from uDeploy end . Involve Jenkins Team(ci-dft@cisco.com) for help .
    
    stage("Docker push") {
            steps {
            sh 'docker push containers.cisco.com/it_cits_connected_software/iqe-platform-automation_iqe:Rev$GIT_COMMIT-Bld$BUILD_ID'
            }
            }
    
### <a id="59"> </a> How deploy a SOX application in PROD environment without joining a Release event(Non-CDRM) in URelease.
    
For a sox application – who want to perform deployment which isn’t part of any Release event or doesn’t join a Release event, below are the steps to follow:-
    
-   Post you deploy the snapshot in stage environment through URelease and triggered a Prod Schedule deployment.
![](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/6b990401-38c6-4ffe-9d2b-1221c7fc344d/media/editor_image_6d7acedd-8243-436c-816f-cb8c55c88918.png?preventCache=1552310394905)  
    
-   	Approve schedule deployment of PROD with the manger.
-   	After approval, if user not joins any Release Event. Bleow are the gates added.
![](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/a6762db2-14a5-471d-9170-a45e1a4021ca/media/editor_image_1b9aed91-75c4-4755-8254-cdb07651d4f8.png?preventCache=1552310394905)
	
-   	Please add the quality status as “**Non-CDRM**” as the deployment is not part of any Release Event
-   	And the deployment would proceed with the sox validations and sox gates would be added based on the sox test case validations
![](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/001fc998-e674-4ad3-baec-a234e18ecf14/media/editor_image_790824e8-d029-43eb-8061-7053f5740122.png?preventCache=1552310394905)
![](https://apps.na.collabserv.com/wikis/basic/api/wiki/70e2a755-5429-4589-a8cb-8d73ca8cf52a/page/3a0d6b0a-bf34-428b-9ede-ce1f39271c7e/attachment/42c39732-b8dd-485f-8df9-f8540d429ba5/media/editor_image_9a854a9c-52d6-47a6-8a7e-5dbc4c312193.png?preventCache=1552310394905)