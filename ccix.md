Software Development Stack (SDaaS) for WebSphere Application Server(CCIX)

Step 1 : Software Development Stack Setup
Step 2 : Eclipse IDE Setup
Step 3 : Build Continuous Integration Job
Step 4 : Validate Artifacts
Step 5 : Code Deploy
Step 6 : Code Promotion/Release
Step 1 : Software Development Stack Setup
 

1. Login to eStore http://estore.cisco.com/

 



2. Search SDaaS Service

 

Navigate to SDaaS by searching in the search bar or clicking through the categories –

 

     IT Infrastructure (CITEIS) > Middleware Services or search SDaaS in the “Search Catalog” box.



 

 

3.     Order Software Development Stack (SDaaS)

 

3.1   Click on Software Development Stack (SDaaS) – Create link.

 



3.2  Click the order button to begin the ordering process. Fill in the Order form. Refer to help text for more help. Provide Stack Name, Organization & Functional Group details.

 



3.3   Select Target Environment as Websphere Application Server. Provide an Application Name and version. You need to have an existing CCIX application provisioned to complete this

step. If you do not have an existing CCIX application, go to http://estore.cisco.com , search for CCIX Create to order an application.

 

 

3.4  If you require a new Source Code Management setup, select Version Control System as Yes. Select the required Version control System (SVN/GIT). The repository Suffix and path will get

automatically populated. You can modify the repository suffix as required to change the repository URL

 



 

If you have an existing Source Code Repository & you want to reuse that, you can select the Version Control System as No and provide your existing repository path URL.

 

3.5   Select Yes or No for Continuous Integration to create a new CI job based on your need. You can include a Sub Directory Path if needed or can leave it blank.

 



 

3.6.  In the next section select Artifactory setup as Yes. Default Artifactory path is generated as shown below.

 



 

3.7 Select Create SRA Pipeline as Yes to create a continuous deployment pipeline to deploy your application on the LAE server.

 



 

3.8  Select the required Lifecycle and the Release Phase. Select Yes for the Primary Deployment Lifecycle for your primary lifecycle.

 



 

3.8  Once these details are entered use Confirm Details to transfer this to table as shown below –

 

In a single order you can configure more than one lifecycle or more than one Application or even a CCIX application along with other applications.

 



3.9 Define Access Control Details –

 

Please review the various roles & click on Submit button to proceed. These groups can also be updated later as part of Modify service.

 



You will be redirected to the following page indicating that your order has been submitted.

 



 

3.11  Stack setup typically take 30 minutes to complete. Once setup is complete request & mailer alias mentioned in order form will get a successful email with instructions on what next.

 

The email that you receive will have the following details:

 

1.)    Svn/Git path where your committed code will reside

2.)    Jenkins job location where you can build the code present in your version control system

3.)    Artifactory URL where the image of code built in Jenkins can be found

4.)    uDeploy URL where the application can be deployed

 

 

Step 2 : Eclipse IDE Setup
 

     2.1 Checkout the code from your version control system into Local

     2.2 Configure your pom.xml

     2.3 Commit your latest code into the Repository

 

       Check-in and Check-out code using Eclipse

 

Step 3 : Build Continuous Integration Job
 

     3.1 Trigger the build in Jenkins

 

Once your latest code is committed into the repository, build the code using Jenkins.

 

     a) Log in to Jenkins with the URL provide in your email

 



b.)    Go to the exact path where your project resides

 



c.)     Click on Configure to Configure your application details.This is needed if you need any customization in the default job created.

 



d.)    Click on Build Now option to start maven build. You can view progress of the build in build history area. Click on the progress bar to view build logs in the console.

 



 

Step 4 : Validate Artifacts
 

     4.1 Validate the Snapshot in Artifactory

 

     Once the build is completed successfully in Jenkins you can view your build in artifactory.

 

     To view your build, you can:

Use the Artifactory icon in the build history section
 



 

Use Artifactory Snapshot URL in the email
Login to Artifactory and browse to path
 

 

Follow the instructions given in email to login to Artifactory console.

 

a.       Login to Artifactory

 



b.      Click on the Artifacts Tab and the tree browser as shown

 



 

c.       Select ext-snapshot-local and go the exact path of your application

 



d.      You must be able to see the file that is built in Jenkins under the Snapshot as follows

 



 

e.      A successful build will have files as shown above. After the Artifactory gets the build artifacts now it’s time to get this deployed. Artifactory maintains the build history you can view all your previous build details also in the browser. The build files are sorted in sequence based on build time so the last file is your latest build. You can view the details of the build on right panel by selecting the file in Repository browser.

Note: Only successfully builds in Jenkins will be visible in artifactory.

Note : UDeploy tool will auto pick(Every 4-5 mins) the latest file uploaded & deploy to default deployment lifecycle (if the latest file is not already deployed) provided while ordering Stack.

 

Step 5 : Code Deploy 
 

     Verify the Deployment Activities

 

While ordering the stack you would have selected your primary deployment lifecycle. uDeploy picks the build from Artifactory (this is approximately 10 mins after the build in Jenkins) and deploys to the primary environment.

For deployments to your Dev or primary lifecycle, there is nothing you need to do. However, if you are interested in knowing what’s going on during this deployment phase, follow the instructions below.

 

a.)    Login to uDeploy with your CEC credentials (Link given as part of SDaaS confirmation email). Click on Applications tab to view your applications.

 



 

b.)    Click on application link to view the complete details and deployment history

 



 

c.)     Click on View Request at the right corner of the page – Execution status will be there to view. On a successful deployment this will show everything green.

 



 

d.)    You can use the logs provided to debug the code in any particular step

 



 

e.)    Once the application looks green and has no error, click on the snapshot button shown below to create a snapshot.

 

 

 

f.)     Enter the name and description of the snapshot that you created

 


Step 6 : Code Promotion/Release 
 

     Promotion across Lifecycles

 

a.)    Login to uRelease console (refer the URL from SDaaS confirmation mail)

 



b.)    Select the Pipeline view option



 

c.)     Select your application in the list to view deployment pipeline.

 



 

d.)    In the “Newest” tab you can see the latest snapshot that you have taken in uDeploy. You can drag and drop the snapshot to the target lifecycle to push the code.

 



 

e.)    Before you drag and drop to the required lifecycle, make sure your unit test cases are passed. If they are pass, click on the + symbol for Quality Status and select Unit test Pass as shown below.

 



f.)     When you drag and drop the snapshot to a new lifecycle you can schedule the deployment time also. A pop up appears when you drop the snapshot to confirm the action.

 

Click ok to continue. Now deployment scheduler popup will appear, you can schedule time to deploy the code to new lifecycle.

 



Click ok to promote your code to the required lifecycle.

 

 

You can refer to Promote Code Through Application Lifecycle for more detailed explanation on promotion through uRelease.

 

Reach out to us at itdt-sdaas-support@cisco.com for any issues.

