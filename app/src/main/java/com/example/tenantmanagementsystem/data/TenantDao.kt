package com.example.tenantmanagementsystem.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.tenantmanagementsystem.data.model.Tenant

@Dao
interface TenantDao {

    @Insert
    suspend fun insert(tenant: Tenant)

    @Update
    suspend fun update(tenant: Tenant)

    @Delete
    suspend fun delete(tenant: Tenant)

    @Query("SELECT * FROM tenants ORDER BY name ASC")
    fun getAllTenants(): LiveData<List<Tenant>>

    @Query("SELECT * FROM tenants WHERE id = :tenantId")
    fun getTenantById(tenantId: Int): LiveData<Tenant?>
}