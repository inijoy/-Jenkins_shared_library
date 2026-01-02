def call() {
    // 'sonar_server' is the SonarQube server configured in Jenkins
    withSonarQubeEnv('sonar_server') {
        sh """
            \$SCANNER_HOME/bin/sonar-scanner \
            -Dsonar.projectName=Youtube \
            -Dsonar.projectKey=Youtube
        """
    }
}


