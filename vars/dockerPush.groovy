def call(String username, String credentialId, List<String> images){
  echo 'Logging in to Docker Hub'
   withCredentials([
   usernamePassword(
   credentialsId: credentialId,
   usernameVariable: 'DOCKER_USERNAME',
   passwordVariable: 'DOCKER_PASSWORD'
  )
  ]) {
  sh 'docker login -u $DOCKER_USERNAME -p $DOCKER_PASSWORD'
  }

  echo 'Pushing Docker images'
  images.each { image ->
        sh "docker push ${username}/${image}:latest"
    }
  
}
