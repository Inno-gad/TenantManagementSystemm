# Tenant Management System

An Android app for landlords to record tenants, see total rent, and call tenants.

## Download
Latest APK: see **Releases** on the right of this page.

## Features
- Register and log in
- Dashboard with number of tenants and total rent
- Add tenants and view all tenants (saved with Room)
- Call a tenant, options menu and navigation drawer

## Architecture
- `ui/`: Activities, Fragments and TenantViewModel (UI layer)
- `data/`: Tenant, TenantDao, TenantDatabase, TenantRepository (data layer)
- Flow: Screens → TenantViewModel (LiveData) → TenantRepository → Room

## Team
| Stage | Role | Member       | Admission No. | Pull request |
|---|---|--------------|-------|--|
| 1 | Lead | Innocent Gad | 183419 | N/A (Initial setup) |
| 2 | ViewModel | Sky Nderitu  | 171813 | https://github.com/Inno-gad/TenantManagementSystemm/pull/6 |
| 3 | Room | Kayla Munga  | 189636 | https://github.com/Inno-gad/TenantManagementSystemm/pull/10 |
| 4 | Screens | Sean Kamau   | 168976 | https://github.com/Inno-gad/TenantManagementSystemm/pull/7 |
| 5 | Data integration | Bill Barasa  | 190354| https://github.com/Inno-gad/TenantManagementSystemm/pull/9 |
| 6 | Release | Innocent Gad | 183419 | (Paste Stage 6 PR link after creating it) |