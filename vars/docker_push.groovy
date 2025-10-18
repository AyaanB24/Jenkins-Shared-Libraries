def call(String Project, String ImageTag, String dockerhubuser){
  echo "Pushing to Docker Hub...."
  withCredentials([usernamePassword(credentialsId: 'dockerHubCred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
      sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  }
  sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
}
