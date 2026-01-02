def call() {
    // 'sonar-scanner' is the name of the SonarQube server configured in Jenkins
    withSonarQubeEnv('sonar-scanner') {
        sh """
            \$SCANNER_HOME/bin/sonar-scanner \
            -Dsonar.projectName=Youtube \
            -Dsonar.projectKey=Youtube
        """
    }
}


