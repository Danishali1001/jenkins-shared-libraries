def call(imageName, tag, dockerHubUser) {
    sh """
        cd Weather-Application
        docker build -t ${dockerHubUser}/${imageName}:${tag} .
    """
}
