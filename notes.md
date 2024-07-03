# When not to use Multi-stage build:
- When the language you are writing completely packages requirements into a single file ( like in case of GO etc) or at-least as a group of file ( in case of JavaScript etc).
- If you are not planning to run docker exec commands on final artifact to explore the application code.
- If you don’t require the tools and files used in build stage, further down the line to debug the final artifact.

# When to use Multi-stage build:
- When you want to minimize the total size of the final Docker image that you deploy into production.
- When you want to speed up your CI/CD processes by running steps/stages in the Docker file in parallel.
- When different layers in Your Docker file are straight-forward and standardized.
- When you are fine with loosing the build intermediaries and only want the final docker artifact.