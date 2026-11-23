def call(String buildStatus,String recipients){
   emailext body:  """
                       <html>
                       <body style="font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 20px;">
                           <h2 style="color: #2d87f0;">Jenkins Build Notification</h2>
                           <p><strong>Build Result:</strong> "${buildStatus}"</p>
                           <p><strong>Build Number:</strong> "${env.BUILD_NUMBER}"</p>
                           <p><strong>Project:</strong> "${env.JOB_NAME}"</p>
                           <p><strong>Build URL:</strong> <a href="${env.BUILD_URL}">${env.BUILD_URL}</a></p>
                           <p>For more details, please visit the Jenkins job page.</p>
                       </body>
                       </html>
                       """, 
           subject: "${env.JOB_NAME} - ${env.BUILD_NUMBER} - ${buildStatus}", 
           to: "${recipients}",
           mimeType: 'text/html'
}