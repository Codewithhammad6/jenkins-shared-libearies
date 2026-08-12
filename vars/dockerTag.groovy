def call(String username, Map<String, String> images) {

    echo 'Tagging Docker images'

    images.each { localImage, dockerHubRepo ->

        sh """
            docker tag ${localImage}:latest \
                ${username}/${dockerHubRepo}:latest
        """
    }
}
