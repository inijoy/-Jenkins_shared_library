def call() {
    // Ensure 'kubeconfig' matches your Jenkins Secret File Credential ID
    withKubeConfig([credentialsId: 'kubeconfig']) {
        sh "/usr/local/bin/kubectl apply -f deployment.yml"
    }
}