docker run -e "ACCEPT_EULA=Y" -e "SA_PASSWORD=yourStrong(!)Password" --name sqlbase -p 3000:1433 -d mcr.microsoft.com/mssql/server:2019-latest