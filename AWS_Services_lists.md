# -------------------------------------- All AWS SERVICES AND THERE USECASE: --------------------------------------------// 

## Amazon EC2 (Elastic Compute Cloud):
Provides virtual servers in the cloud (on-demand instances) for running various applications. 
Use Cases: Web servers, databases, high-performance computing, batch processing, and more.

## Amazon Lightsail:
Ideal for simple and predictable virtual server deployments. 
Use Cases: Running small-scale websites and applications.

## AWS Lambda: 
Serverless compute service that executes code in response to events. 
Use Cases: Microservices, backend processing, data processing, and event-driven applications.

## Amazon Elastic Beanstalk: 
Simplifies deployment and scaling of web applications. 
Use Cases: Deploying web applications on various platforms like Java, Node.js, Python, and .NET.

## Amazon ECS (Elastic Container Service): 
Manages containerized applications. 
Use Cases: Container orchestration for deploying and scaling containerized applications.

## Amazon EKS (Elastic Kubernetes Service): 
Managed Kubernetes service for container orchestration. 
Use Cases: Leveraging Kubernetes for containerized application deployment and management

## AWS Amplify:
AWS Amplify is a collection of tools and libraries designed to simplify the development and deployment of web and mobile applications on AWS. 
Use Case: Building secure and scalable web applications that require user authentication, data management, and real-time updates.
Developing mobile applications with offline functionality and seamless connection to backend services.

## Code Commit :
Secure cloud storage for your codebase, like a GitHub for AWS.

## Code Build: 
Automates building and testing your code, no server management needed.

## Code Pipeline :
Creates workflows (CI/CD pipelines) to automate building, testing, and deploying your application.

## Code Deploy:
Automates deploying your code to various AWS services like servers or containers.

## Elastic Cache: 
Boosts application performance by caching frequently accessed data in memory.


# -------------------------- Storage Services ----------------------------------------------//

## Amazon S3 (Simple Storage Service): 
Object storage for various data types, including images, videos, and backups. 
Use Cases: Static website hosting, data lakes, backups and disaster recovery, application data storage.

## Amazon EBS (Elastic Block Store): 
Block storage for persistent data attached to EC2 instances. 
Use Cases: Database storage, application data volumes, persistent storage for containerized applications.

## Amazon FSx (File Storage for Amazon Web Services): 
Managed file storage service for a variety of file system protocols. 
Use Cases: High-performance file storage for applications like content management systems and collaboration tools.

## Amazon S3 Glacier: 
Low-cost storage for long-term data archiving. 
Use Cases: Medical records, legal documents, backups for infrequently accessed data.

## Elastic Container Registery (ECR):
Basically used for docker images storage

## EFS :
Fully managed third-party file systems optimized for a variety of workloads

## Storage Gateway:
Hybrid Storage Integration


# ------------------------- Database Services -----------------------------------------------//

## Amazon RDS (Relational Database Service): 
Managed relational database service for various database engines like MySQL, PostgreSQL, Aurora, and SQL Server. 
Use Cases: Hosting relational databases for web applications, enterprise applications, and other data-driven applications.

## Amazon DynamoDB: 
NoSQL database service for fast and scalable data storage. 
Use Cases: Mobile backends, gaming applications, IoT data storage, and real-time applications.

## Amazon Redshift: 
Data warehouse service for large-scale data analytics. 
Use Cases: Business intelligence, data warehousing, and large-scale data analysis.

## Amazon Neptune: 
Graph database service for connected data. 
Use Cases: Social networks, recommendation engines, knowledge graphs, and fraud detection

## Amazon DocumentDB
Fully-managed MongoDB-compatible database service

## Amazon QLDB
Fully managed ledger database

## Amazon Timestream
Amazon Timestream is a fast, scalable, and serverless time series database for IoT and operational applications.



# -------------------------- Networking & Content Delivery Services --------------------------------//

## Amazon VPC (Virtual Private Cloud): 
Creates a logically isolated virtual network within the AWS cloud. 
Use Cases: Securely isolate your resources in the cloud, manage network traffic flow, and implement network security policies.

## Amazon Route 53: 
Highly available and scalable Domain Name System (DNS) service. 
Use Cases: Routing traffic to your websites and applications hosted on AWS or elsewhere.

## Amazon CloudFront: 
Global content delivery network (CDN) for delivering content with low latency. 
Use Cases: Delivering static and dynamic content like websites, videos, and applications with high performance and scalability.

## Api Gateway:
Build, Deploy and Manage APIs

## AWS App Mesh
Easily monitor and control microservices

## AWS Cloud Map
Build a dynamic map of your cloud

## Direct Connect
Dedicated Network Connection to AWS 

Deploy and scale private mobile networks on-premises

## Route 53 Application Recovery Controller
Monitor application recovery readiness and manage failovers



# ------------------------------ Management & Governance Services ------------------------------------//
## AWS CloudTrail: 
Records AWS API calls for security and compliance purposes. 
Use Cases: Auditing and monitoring API activity, troubleshooting issues, and meeting compliance requirements.

## AWS CloudWatch: 
Monitoring service for resources and applications running on AWS. 
Use Cases: Monitoring performance, identifying trends, troubleshooting issues, and optimizing resource utilization.

## AWS CloudFormation: 
Infrastructure as code (IaC) service for managing and automating AWS resources. 
Use Cases: Provisioning and managing cloud infrastructure in a repeatable and consistent manner.

## AWS Config: 
Resource configuration management service for ensuring compliance and automation. 
Use Cases: Ensures resources adhere to defined configurations and automates resource updates to maintain compliance.


# --------------------------------- Security & Identity Services --------------------------------------//

## AWS IAM (Identity and Access Management): 
Controls access to AWS resources by users and applications. 
Use Cases: Managing user permissions, securing API access, and implementing the principle of least privilege

## AWS Cognito: 
User identity service for web and mobile applications. 
Use Cases: Implementing user authentication and authorization for web and mobile applications.

## AWS Key Management Service (KMS): 
Manages encryption keys for data security. 
Use Cases: Securing data at rest and in transit, ensuring compliance with encryption regulations.


# ----------------------------------- Messenging and Alerting Services -------------------------------//

## Simple Notification service (SNS):
Sending SMS alerts, triggering Lambda functions for events, notifying mobile apps about updates.

## Simple Queue Service(SQS):
SQS is a versatile and robust message queuing service that simplifies asynchronous communication between applications and facilitates building scalable and fault-tolerant systems on AWS.

## X-RAY: 
Amazon X-Ray is a service designed to analyze and debug distributed applications running on AWS


# ------------------------------------ Migration & Transfer -----------------------------------------//
## Application Discovery Service
Discover on-premises application inventory and dependencies

## AWS Application Migration Service
AWS Application Migration Service (MGN) automates lift-and-shift migration.

## Database Migration Service
Managed Database Migration Service

## DataSync
DataSync simplifies, automates, and accelerates moving data

## AWS Mainframe Modernization
AWS Mainframe Modernization

## AWS Migration Hub
Simplify and accelerate the migration of your data centers to AWS

## AWS Snow Family
Large Scale Data Transport

## AWS Transfer Family
Fully managed support for SFTP, FTPS, FTP, and AS2


# ----------------------------------- Media Services ---------------------------------------------// 
## AWS Deadline Cloud
Simplified render management

## Elastic Transcoder
Easy-to-Use Scalable Media Transcoding

## Elemental Appliances & Software
On-premises solutions for video processing and delivery

## Amazon Interactive Video Service
Managed interactive live streams

## Kinesis Video Streams
Capture, Process, and Store Video Streams for Analytics and Machine Learning

## MediaConnect
Reliable, secure, and flexible transport for live video

## MediaConvert
Convert file-based content for broadcast and multiscreen delivery

## MediaLive
Convert video inputs into live outputs for broadcast and streaming delivery

## MediaPackage
Deliver video to many devices using just-in-time format conversion.

## MediaStore
Store and deliver video assets for live or on-demand media workflows

## MediaTailor
Personalise and monetise multiscreen content with channel assembly and server-side ad insertion.

## Nimble Studio
Accelerate building a cloud-based content creation studio or setup your Thinkbox Deadline render farm


# ----------------------------------- Container Sercvices --------------------------------------//
## Elastic Container Registry
Fully-managed Docker container registry : Share and deploy container software, publicly or privately

## Elastic Container Service
Highly secure, reliable, and scalable way to run containers

## Elastic Kubernetes Service
The most trusted way to start, run, and scale Kubernetes

## Red Hat OpenShift Service on AWS
Fully managed Red Hat OpenShift service on AWS


# ---------------------------------------------------------------------------------------------------------------------------//




