---
title: "Getting Started"

weight: 2
---


**Software Development Stack (SDaaS) request process**

**Objective**  
To create SDaaS stack to use the cisco builds on your application source code.

**Step 1: Login to interface**  
Go to  [eStore](http://estore.cisco.com/)  and fill in your credentials

![](http://minio.cisco.com/hackmd/uploads/upload_576193102df729515d1c4c5f816bff1b.png)

**Step 2: Search SDaaS Service**  
Navigate to SDaaS by searching in the search bar or clicking through the categories –

Search SDaaS in the “Search Catalog” box.

![](http://minio.cisco.com/hackmd/uploads/upload_f2cd1aab6cdabcd1ac0330ee6183b5b9.png)

**Step 3: Order Software Development Stack (SDaaS)**

_**Step 3.1: Start stack creation**_  
Click on “Software Development Stack (SDaaS) – Create” link.

![](http://minio.cisco.com/hackmd/uploads/upload_d6e5933b1682f296354784250cd50f13.png)

_**Step 3.2: Order and define software stack**_  
Click the order button to begin the ordering process. Fill in the Order form. Refer to help text for more help. Provide Stack Name, Organization & Functional Group details.

![](http://minio.cisco.com/hackmd/uploads/upload_47f03f0797237d3a1ed1079eb45f7914.png)

_**Step 3.3: Specify targeted runtime**_  
Select Target Environment as per requirement and fill the the mandatory data based on this selection.

![](http://minio.cisco.com/hackmd/uploads/upload_26b3c2128a2d5d9ecbd5f135745ca835.png)

_**Step 3.4: Manage source code**_

If you require a new Source Code Management setup, select Version Control System as Yes.  
Select the required Version control System (SVN/Bitbucket). The repository Suffix and path will get automatically populated. You can modify the repository suffix as required to change the repository URL.

![](http://minio.cisco.com/hackmd/uploads/upload_04e7e7ff113ae2d479d3065215e5fa6f.png)

If you have an existing Source Code Repository & you want to reuse that, you can select the Version Control System as No and provide your existing repository path URL.

_**Step 3.5: Setup Continuous Integration**_  
Select “Yes” or “No” for Continuous Integration to create a new CI job based on your need.

![](http://minio.cisco.com/hackmd/uploads/upload_e837dd0a8d115a06cf62c7b0995e2bd0.png)

You can include a Sub Directory Path if needed or can leave it blank.

Select the required Job Type (Ant or Maven)

_**Step 3.6: Configure Repository**_

Based on the previous selections, configure the required Repository.

_**Step 3.7: Select Application Lifecycle as Other.**_

![](http://minio.cisco.com/hackmd/uploads/upload_7dca75ea2600d8369b8e5651e8ea8f17.png)

_**Step 3.8: Confirm Details**_  
Once these details are entered use Confirm Details to transfer this to table as shown below. In a single order you can configure more than one Application or more than one Technology.

![](http://minio.cisco.com/hackmd/uploads/upload_692f8754ab8f24b00d7ebd934f0e525b.png)

_**Step 3.9: Define Access Control Details**_

Please review the various roles & click on Submit button to proceed. These groups can also be updated later as part of Modify service.

![](http://minio.cisco.com/hackmd/uploads/upload_0142607c735b570b7e7058803ae07f1b.png)

You will be redirected to the following page indicating that your order has been submitted. Order will be submitted for processing with a confirmation number. Use this number for future correspondence with support teams if needed. If you have any questions regarding to your SDaaS request, please reach out to  [itdt-sdaas-support@cisco.com](mailto:itdt-sdaas-support@cisco.com)

![](http://minio.cisco.com/hackmd/uploads/upload_a2a51a65d6df3a02cd24a3ecdbd9c303.png)

_**Step 3.10: Wait for completion of stack creation**_

Stack setup typically take 15-20 minutes to complete. Once setup is complete request & mailer alias mentioned in order form will get a successful email with instructions on what next.

The email that you receive will have the following details:

1.  Svn/Bitbucket path where your committed code will reside
2.  Jenkins job location where you can build the code present in your version control system
3.  Container Repository URL where the image of code built in Jenkins can be found





