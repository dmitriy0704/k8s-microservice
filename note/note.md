# Заметки про проекту

## Порядок запуска

1. Запустить PostgreSQL:
    ```bash
    kubectl apply -f database-secret.yaml
    kubectl apply -f database-headless-service.yaml
    kubectl apply -f database-statefulset.yaml
    ```

2. Запустить backend:
   ```bash
   kubectl apply -f backend-deployment.yaml
   kubectl apply -f backend-service.yaml
   ```

3. Запустить frontend:(фронтенда пока нет)
   ```bash
   kubectl apply -f frontend-deployment.yaml
   kubectl apply -f frontend-service.yaml
   ```

4. Запустить ingress:
   ```bash
   kubectl apply -f ingress.yaml
   ```
