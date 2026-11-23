def call(String slackChannel){ 
          
   slackSend channel: "${slackChannel}", color: "danager"  , message: "Jenkins Job ${env.JOB_NAME} - ${env.BUILD_NUMBER} - FAILURE. Please check the Jenkins console output for details. ${env.BUILD_URL}"

}