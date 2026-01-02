def call() {
    // 'sonar-server' is the name of the SonarQube server configured in Jenkins
    withSonarQubeEnv('sonar-server') {
        sh """
            \$SCANNER_HOME/bin/sonar-scanner \
            -Dsonar.projectName=Youtube \
            -Dsonar.projectKey=Youtube
        """
    }
}
