
## Software Development Stack (SDaaS) for Advanced Deployment (LAE)

Multiple pipeline feature is an advance use case for deployment. It enables the application development teams to work on different  features concurrently by utilizing the option of having single application stack wired up for multiple development and deployment pipelines including standard and custom life cycles offered by LAE runtime platform.

 

The educational webinars were held to demonstrate and provide deep dive understanding of the feature including needed Process change for deployment.

1. IST Session : Play recording

2. PT Session: Play recording

 

Concept view:

MPD4.png

 

 

### Step by Step Process with example:

 

The development & deployment steps described below are based on following details. It uses Git repository but the same can be achieved using SVN as well.

Stack Name - jrsdaas2

Application - jrjboss

Version - Jbosseap-6

Lifecycles - Dev, Stg, cjd1,cjs1, cjd2, cjs2, Lt, Prod

Git Repository - http://gitscm-sb.cisco.com/scm/it-gis-ats-jrsdaas2/jrjboss-jbosseap6

Jenkins Jobs  - http://ci-stg.cisco.com/job/IT-GIS-ATS/job/jrsdaas2/jrjboss-jbosseap6 
                      - http://ci-stg.cisco.com/job/IT-GIS-ATS/job/jrsdaas2/jrjboss-jbosseap6-cjd1

                      - http://ci-stg.cisco.com/job/IT-GIS-ATS/job/jrsdaas2/jrjboss-jbosseap6-cjd2

Artifactory Repository -

http://svnarapp-dev-01:8081/artifactory/ext-release-local/it/gis/ats/jrsdaas2/jrjboss/jbosseap-6

UD & UR Application Name - jrjboss-lae-Jbosseap-6

 

 

**Step 1: Create Release/Feature Branches**
 

Login to Stash & create release branches out of the master branch.

 



 

http://gitscm-sb.cisco.com/projects/IT-GIS-ATS-JRSDAAS2/repos/jrjboss-jbosseap6/browse?at=refs%2Fheads%2Fcjd1

http://gitscm-sb.cisco.com/projects/IT-GIS-ATS-JRSDAAS2/repos/jrjboss-jbosseap6/browse?at=refs%2Fheads%2Fcjd2

 

 

**Step 2: Update pom.xml entries**
 

At this step you need to update the pom.xml files on each of these branches with appropriate groupId, artifactId & version -

 



Note : Please make sure the highlighted text has appropriate primary lifecycle, above example is for Dev, for cjd1 & cjd2 branches you need to update accordingly.

 

Once changes are done commit the branches & move to next step.

 

**Step 3: Configure Continuous Integration Jobs**
 

The CI Jobs are provisioned with default branch, you would need to change them with the branches that you have created above.

 

	a) Log in to Jenkins with the URL provided in your email & go to the exact path where your job resides



  	b)   Click on Configure to configure your branch details.





Likewise update branch details in other jobs as well -

Jenkins -> Configuration for Dev : Update Branch Specifier (blank for 'any') - */master

Jenkins -> Configuration for cjd1 : Update Branch Specifier (blank for 'any') - */cjd1

Jenkins -> Configuration for cjd2 : Update Branch Specifier (blank for 'any') - */cjd2

 

 

**Step 4: Build & Deploy to Primary Deployment Lifecycles**
 

This step defines how to build & deploy to primary development lifecycles. In this example these are - Dev, CJD1 & CJD2.

 

###Step 4.1: Build the Project/Job

 

Click on Build Now option to start maven build. You can view progress of the build in build history area. Click on the progress bar to view build logs in the console.



 

###Step 4.2: Validate the Snapshot in Artifactory

 

                a. Login to Artifactory URL provided in the confirmation mail.

 



b.      Click on the Artifacts Tab and the tree browser as shown

 



 

c.       Select ext-snapshot-local and go the exact path of your application

 



 

d.      You must be able to see the file that is built in Jenkins under the Snapshot as follows

 



 

                 e.      A successful build will have files as shown above. After the Artifactory gets the build artifacts now it’s time to get this deployed. Artifactory maintains the build history you can view                          all your previous build details also in the browser. The build files are sorted in sequence based on build time so the last file is your latest build. You can view the details of the build                          on right panel by selecting the file in Repository browser.

Note: Only successfully builds in Jenkins will be visible in artifactory.

Note : UDeploy tool will auto pick(Every 4-5 mins) the latest file uploaded & deploy to default deployment lifecycle (if the latest file is not already deployed) provided while ordering Stack.

 

###Step 4.3: Verify the Deployment Activities

 

a)    Login to uDeploy with your CEC credentials (Link given as part of SDaaS confirmation email). Click on Applications tab to view your applications.

 



 

b)    Click on application link to view the complete details and deployment history



c)   Click on View Request at the right corner of the page – Execution status will be there to view. On a successful deployment this will show everything green.



 

**Step 5: Promote to Release Lifecycles**
 

###Step 5.1: Release the build

 

Return back to Jenkins to promote the last build to release lifecycles. Click on Artifactory Release Staging link.

 



 

On next screen update the Release Version if needed to map this with snapshot version.

 



 

If the build is successful then it will be promoted to Artifactory.



 

###Step 5.2: Validate the Release in Artifactory

 

Go back to Artifactory UI & this time expand the ext-release-local folder & traverse to the folder that matches with your Stack name.



###Step 5.3: Create Snapshot for Promote

 

Click on Application tab & traverse till Snapshots tab.

 



 

In Snapshots, click on Create Snapshot and name the Release & Save.



Now select the release Component & click on Add... link.

 

Choose the appropriate version.

 



 

Right after that the Snapshot would appear in URelease & is ready to promote to Release Lifecycles.

 

###Step 5.4: Promote using URelease

 

a)   Login to uRelease console (refer the URL from SDaaS confirmation mail)

 



b)    Select the Pipeline view option

 



c)  Select your application in the list to view deployment pipeline.

 



 

d.)    In the “NEWEST” tab you can see the latest snapshot that you have created in uDeploy. You can drag and drop the snapshot to the target lifecycle to push the code.

 



 

e.)    Now make sure your unit test(any such gates) are passed. If they are pass, click on the + symbol for Quality Status and select Unit test Pass as shown below.

 



 

 

Note : Follow the same steps to build, deploy & promote from other primary deployment lifecycles - CJD1 & CJD2.

For more detail please refer to attached document.

 

Frequently Asked Questions:

 

No#
Question
Answer
#1 How do we merge the branches if 2 or more branches seem to work good in the primary lifecycle

You can merge the branches to the development brach & deploy that to Dev environment
#2	Lets say I work on #1 feature, my teammate works on #2 . If both the branches work fine, can we merge them and release the code to the prod with both the features.	Yes. That's the way development team collaborates
#3	Can I use the feature for existing Stack?	Yes. SDaaS-Modify service provides you the capability to convert existing stack into multiple pipeline when you are ready.
#4	Do we always have to use multiple pipeline feature?	No. It depends on your requirement. If you don't have multiple teams working simultaneously on different features , you can still use existing to have single pipeline.
#5	If my project consists of multiple modules as dependencies for web module, does all dependent modules also have to be named with lifecycle ?

There is no change in dependency mapping. You can continue to build the dependencies that way you do today.
#6	will the custom lifecycle string specified in estore available in LAE environment ? e..g, using the variable in shell scripts.

Yes, you can still get the lifecycle value from the appname like what you currently have done in pre* scripts.
#7	The team should merge the branches in GIT and create another job in jenkins and promote it to artifactory release?	Every Primary deployment lifecycle will have one Jenkins job. If you merge the code into development brach & that needs to be deployed to Dev there will be a Jenkins job provisioned for that, same will be used  .
#8	How to create tar.gz for LAE migration?

How to do the DB setup for jboss-eap-6.x  ?

The process is documented at below location

1. Sample XML for creating tar.gz http://wikicentral.cisco.com/display/LAEDOCS/Sample+XML+files+for+Tomcat

  2. JBoss Database setup http://wikicentral.cisco.com/display/LAEDOCS/Database+setup+for+JBoss

#9	I have recently heard about CCIX to LAE Migration. Is there any information around it ?	
Please use the guide :

http://wikicentral.cisco.com/display/LAEDOCS/CCIX+Migrate+to+LAE+User+Guide

#10	Where can I find detailed documentation for multiple pipeline feature?	The attached word document contains the details along UI !screenshots.
#11	I am able to take the snapshot from development version to promote, it does not error out but deployment did not happen to Stage.	The process fails silently. In order t promote, you should always take the screenshot from release version.