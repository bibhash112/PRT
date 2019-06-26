# End to End deployment 

- STEP 1: Login to Artifactory.
https://repo-art.cisco.com/artifactory/webapp/#/login

![cd](images/step1.png)

- STEP 2: Go to your artifactory Repository

![cd](images/step2.png)

- Step 3: Click on Deploy to deploy an artifact and the below window will pop up.

![cd](images/step3.png)

- Step 4: Select your artifact file to be deployed. Make sure that the file extention is the same as configured in uDeploy.

![cd](images/step4.png)

- Step 5: After the file is uploaded,click on "Deploy as Maven Artifact" give the version name and the proper group ID and Artifact ID.

![cd](images/step5.png)

- Step 6: Click on deploy to deploy the artifact. On successful deployment, you'll get this message.

![cd](images/step6.png)

- Step 7: Login to uDeploy and search for your component.
https://deploy.cisco.com:8443/

![cd](images/step7.png)

- Step 8: The deployment to dev environment is automated and happens when the file is deployed in artifactory. Click on "View Request" to see the execution and the logs.

![cd](images/step8.png)

- Step 9: The steps can be expanded to see the deployment steps and logs.

![cd](images/step9.png)

- Step 10: Go back to the component->Versions->Select your version->Configuration->Version Properties.

![cd](images/step10.png)

- Step 11: Add the User Stories/ Requirement_ID and click on save.

![cd](images/step11.png)

- Step 12: Create snapshot. To create a snapshot click on "Camera" icon.

![cd](images/step12.png)

- Step 13: Give a name to the snapshot and give a description and click on save.

![cd](images/step13.png)

- Step 14: Once snapshot is created, go snapshot->Component Versions and add version to your snapshot.

![cd](images/step14.png)

- Step 15: Now go to uRelease and click on "Pipeline View".
https://release.cisco.com:8443/

![cd](images/step15.png)

- Step 16: Search for your Application/Release.

![cd](images/step16.png)

- Step 17: Check if the latest snapshot is visible and then drag and drop the snapshot to stage to create a schedule deploy to stage environment.

![cd](images/step17.png)

- Step 18: Give the scheduled date and time and other fields as per requirement and click on save to create a deployment schedule.

![cd](images/step18.png)

- Step 19: Once the schedule is created, click on it.

![cd](images/step19.png)

- Step 20: Add the necssary gates and check whether the correct version is being deployed. Then click on "View Execution & Deployment Plan"

![cd](images/step20.png)

- Step 21: We need QA approval for stage deployment. Get the approval from the lead.

![cd](images/step21.png)

- Step 22: Once the approval has been given, click on "Start Deployment".

![cd](images/step22.png)

- Step 23: Click on the "start" option in the Deployment Tasks tab.

![cd](images/step23.png)

- Step 24: Once the deployment has started, you can track the progress and view the steps/logs by clicking on View/Edit for the deployment task.

![cd](images/step24.png)

- Step 25: Go to comments and click on "View Execution".

![cd](images/step25.png)

- Step 26: It will direct to uDeploy where you can  check the logs and the deployment steps.

![cd](images/step26.png)

- Step 27: Once the deployment to stage is successful, the snapshot can now be deployed to prod. Drag and drop the snapshot to prod and create a deployment schedule.

![cd](images/step27.png)

- Step 28: Click on "OK" to create a schedule.

![cd](images/step28.png)

- Step 29: Once the schedule is created check whether the correct version is selected and add the necessary gates.

![cd](images/step29.png)

- Step 30: Get the IT Manager's approval and click on "Start Deployment" and the "start" option in Deployment Tasks.

![cd](images/step30.png)

- Step 31: Click on View/Edit in Deployment.

![cd](images/step31.png)

- Step 32: Go to Comments and click on "View Execution to see the deployment process and the deployment steps"

![cd](images/step32.png)

- Step 33: It will direct you to uDeploy where you can see the deployment steps.

![cd](images/step33.png)


