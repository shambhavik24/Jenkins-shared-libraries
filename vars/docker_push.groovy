df call(String Project, String ImageTag, String dockerhubuser) {
  withCrediential([usernamePassword(credientialsId: 'docker', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]) {
 sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  
  }

  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"

  
}
