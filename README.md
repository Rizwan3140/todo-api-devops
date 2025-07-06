# todo-api-devops
# 🧪 To-Do API - DevOps CI/CD Project (VIT)

## 👨‍💻 Submitted By
**Shaik Mothi Rizwan Ansar**  
**Reg No:22BCE8201** 
**Project Title:** CI/CD Pipeline using Jenkins (To-Do API)

---

## 📦 Project Stack

| Tool        | Purpose                            |
|-------------|------------------------------------|
| Git         | Source Control                     |
| GitHub      | Remote Repository                  |
| Jenkins     | CI/CD Pipeline                     |
| Maven       | Build Tool                         |
| JUnit       | Unit Testing Framework             |
| Docker      | Containerization                   |
| Ansible     | Configuration Management (Deploy)  |
| Terraform   | Infrastructure as Code (Optional)  |
| Ubuntu 22.04| Base OS                            |

---

## 📁 Folder Structure

todo-api-devops/
├── src/ # Spring Boot App
├── Jenkinsfile # CI/CD Pipeline
├── Dockerfile # Docker Build
├── deploy.yml # Ansible Playbook
├── terraform-setup/ # Terraform config
├── monitoring/ # For Grafana (Optional)
└── README.md # You're reading this!




---

## 🚀 CI/CD Pipeline Overview

### Step 1: Build
bash
mvn clean install

###Step 2: Unit Tests

mvn test

###Step 3: Docker Build & Run

docker build -t todo-api .
docker run -d -p 8081:8080 --name todo-api-container todo-api

###Step 4: Ansible Deploy

ansible-playbook deploy.yml

###Step 5: Terraform Deploy (Bonus)

cd terraform-setup
terraform init -upgrade
terraform apply -auto-approve

###Conclusion

This project demonstrates a full DevOps pipeline from GitHub commit to production using Jenkins, Docker, Maven, and optional infrastructure tools like Ansible and Terraform.
