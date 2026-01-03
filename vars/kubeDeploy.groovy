def call() {
    // The credentialsId must match the ID you gave the secret file in Jenkins
    withKubeConfig([credentialsId: 'kubeconfig']) {
        sh "kubectl apply -f deployment.yml"
    }
}