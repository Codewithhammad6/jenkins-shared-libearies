def call(){
  echo 'Building Docker images'
        sh '''
            docker compose build
        '''
}
