package us.ihmc.robotDataLogger;

import us.ihmc.communication.packets.Packet;
import us.ihmc.euclid.interfaces.Settable;
import us.ihmc.euclid.interfaces.EpsilonComparable;
import java.util.function.Supplier;
import us.ihmc.pubsub.TopicDataType;

public class YoRegistryDefinition extends Packet<YoRegistryDefinition> implements Settable<YoRegistryDefinition>, EpsilonComparable<YoRegistryDefinition>
{
   /**
   		 * Id of the registry
   		 *
   		 * This is a long long field to allow generating unique ID's per thread/process to support future dynamic registries.
   		 */
   public long id_;
   public long parent_;
   public java.lang.StringBuilder name_;

   public YoRegistryDefinition()
   {
      name_ = new java.lang.StringBuilder(255);
   }

   public YoRegistryDefinition(YoRegistryDefinition other)
   {
      this();
      set(other);
   }

   public void set(YoRegistryDefinition other)
   {
      id_ = other.id_;

      parent_ = other.parent_;

      name_.setLength(0);
      name_.append(other.name_);

   }

   /**
   		 * Id of the registry
   		 *
   		 * This is a long long field to allow generating unique ID's per thread/process to support future dynamic registries.
   		 */
   public void setId(long id)
   {
      id_ = id;
   }
   /**
   		 * Id of the registry
   		 *
   		 * This is a long long field to allow generating unique ID's per thread/process to support future dynamic registries.
   		 */
   public long getId()
   {
      return id_;
   }

   public void setParent(long parent)
   {
      parent_ = parent;
   }
   public long getParent()
   {
      return parent_;
   }

   public void setName(java.lang.String name)
   {
      name_.setLength(0);
      name_.append(name);
   }

   public java.lang.String getNameAsString()
   {
      return getName().toString();
   }
   public java.lang.StringBuilder getName()
   {
      return name_;
   }


   public static Supplier<YoRegistryDefinitionPubSubType> getPubSubType()
   {
      return YoRegistryDefinitionPubSubType::new;
   }

   @Override
   public Supplier<TopicDataType> getPubSubTypePacket()
   {
      return YoRegistryDefinitionPubSubType::new;
   }

   @Override
   public boolean epsilonEquals(YoRegistryDefinition other, double epsilon)
   {
      if(other == null) return false;
      if(other == this) return true;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.id_, other.id_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsPrimitive(this.parent_, other.parent_, epsilon)) return false;

      if (!us.ihmc.idl.IDLTools.epsilonEqualsStringBuilder(this.name_, other.name_, epsilon)) return false;


      return true;
   }

   @Override
   public boolean equals(Object other)
   {
      if(other == null) return false;
      if(other == this) return true;
      if(!(other instanceof YoRegistryDefinition)) return false;

      YoRegistryDefinition otherMyClass = (YoRegistryDefinition) other;

      if(this.id_ != otherMyClass.id_) return false;

      if(this.parent_ != otherMyClass.parent_) return false;

      if (!us.ihmc.idl.IDLTools.equals(this.name_, otherMyClass.name_)) return false;


      return true;
   }

   @Override
   public java.lang.String toString()
   {
      StringBuilder builder = new StringBuilder();

      builder.append("YoRegistryDefinition {");
      builder.append("id=");
      builder.append(this.id_);      builder.append(", ");
      builder.append("parent=");
      builder.append(this.parent_);      builder.append(", ");
      builder.append("name=");
      builder.append(this.name_);
      builder.append("}");
      return builder.toString();
   }
}
