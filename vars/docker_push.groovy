df call(String Project, String ImageTag, String dockerHubUser) {
  withCrediential([usernamePassword(credientialsId: 'dockerHubCred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
 sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  
  }

  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"

  
}
