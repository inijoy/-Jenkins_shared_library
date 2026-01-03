def call() {
    withKubeConfig([credentialsId: 'kubeconfig']) {
        sh "/usr/local/bin/kubectl delete -f deployment.yml"
    }
}